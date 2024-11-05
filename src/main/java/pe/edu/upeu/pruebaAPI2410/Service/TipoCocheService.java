package pe.edu.upeu.pruebaAPI2410.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pruebaAPI2410.Entity.TipoCoche;

public interface TipoCocheService {
	TipoCoche create(TipoCoche c);
	TipoCoche update(TipoCoche c);
	void delete(Long id);
	Optional<TipoCoche> read(Long id);
	List<TipoCoche> readAll();
}
