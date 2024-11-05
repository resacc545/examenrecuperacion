package pe.edu.upeu.pruebaAPI2410.Dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pruebaAPI2410.Entity.Coche;



public interface CocheDao {
	Coche create(Coche c);
	Coche update(Coche c);
	void delete(Long id);
	Optional<Coche> read(Long id);
	List<Coche> readAll();
}
