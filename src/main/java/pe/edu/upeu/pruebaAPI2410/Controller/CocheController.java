package pe.edu.upeu.pruebaAPI2410.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import pe.edu.upeu.pruebaAPI2410.Entity.Coche;
import pe.edu.upeu.pruebaAPI2410.Service.CocheService;


@RestController
@RequestMapping("/api/coches")
public class CocheController {

    @Autowired
    private CocheService cocheService;

    @GetMapping
    public ResponseEntity<List<Coche>> readAll() {
        try {
            List<Coche> coches = cocheService.readAll();
            if (coches.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(coches, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Coche> create(@Valid @RequestBody Coche coche) {
        try {
            Coche c = cocheService.create(coche);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coche> getById(@PathVariable("id") Long id) {
        Optional<Coche> coche = cocheService.read(id);
        return coche.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable("id") Long id) {
        try {
            cocheService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coche> update(@PathVariable("id") Long id, @Valid @RequestBody Coche coche) {
        Optional<Coche> existingCoche = cocheService.read(id);
        if (existingCoche.isPresent()) {
            coche.setId(id);
            Coche updatedCoche = cocheService.update(coche);
            return new ResponseEntity<>(updatedCoche, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
