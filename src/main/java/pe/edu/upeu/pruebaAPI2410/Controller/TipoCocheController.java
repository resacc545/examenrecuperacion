package pe.edu.upeu.pruebaAPI2410.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import pe.edu.upeu.pruebaAPI2410.Entity.TipoCoche;
import pe.edu.upeu.pruebaAPI2410.Service.TipoCocheService;


@RestController
@RequestMapping("/api/tipocoches")
public class TipoCocheController {

    @Autowired
    private TipoCocheService tipoCocheService;

    @GetMapping
    public ResponseEntity<List<TipoCoche>> readAll() {
        try {
            List<TipoCoche> tipoCoches = tipoCocheService.readAll();
            if (tipoCoches.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tipoCoches, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<TipoCoche> create(@Valid @RequestBody TipoCoche tipoCoche) {
        try {
            TipoCoche tc = tipoCocheService.create(tipoCoche);
            return new ResponseEntity<>(tc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoCoche> getById(@PathVariable("id") Long id) {
        Optional<TipoCoche> tipoCoche = tipoCocheService.read(id);
        return tipoCoche.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable("id") Long id) {
        try {
            tipoCocheService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoCoche> update(@PathVariable("id") Long id, @Valid @RequestBody TipoCoche tipoCoche) {
        Optional<TipoCoche> existingTipoCoche = tipoCocheService.read(id);
        if (existingTipoCoche.isPresent()) {
            tipoCoche.setId(id);
            TipoCoche updatedTipoCoche = tipoCocheService.update(tipoCoche);
            return new ResponseEntity<>(updatedTipoCoche, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

