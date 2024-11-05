package pe.edu.upeu.pruebaAPI2410.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pruebaAPI2410.Dao.MarcaDao;
import pe.edu.upeu.pruebaAPI2410.Entity.Marca;
import pe.edu.upeu.pruebaAPI2410.Repository.MarcaRepository;

@Component
public class MarcaDaoImpl implements MarcaDao {
	@Autowired
	private MarcaRepository marcaRepository;
	@Override
	public Marca create(Marca c) {
		// TODO Auto-generated method stub
		return  marcaRepository.save(c);
	}

	@Override
	public Marca update(Marca c) {
		// TODO Auto-generated method stub
		return  marcaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		 marcaRepository.deleteById(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return  marcaRepository.findById(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return  marcaRepository.findAll();
	}

}
