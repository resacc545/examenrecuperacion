package pe.edu.upeu.pruebaAPI2410.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pruebaAPI2410.Entity.Marca;

public interface MarcaService {
	Marca create(Marca c);
	Marca update(Marca c);
	void delete(Long id);
	Optional<Marca> read(Long id);
	List<Marca> readAll();
}
