package pe.edu.upeu.pruebaAPI2410.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pruebaAPI2410.Dao.CocheDao;
import pe.edu.upeu.pruebaAPI2410.Entity.Coche;
import pe.edu.upeu.pruebaAPI2410.Repository.CocheRepository;

@Component
public class CocheDaoImpl implements CocheDao {
	
	@Autowired
	private CocheRepository cocheRepository;
	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return cocheRepository.save(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return cocheRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cocheRepository.deleteById(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return cocheRepository.findById(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return cocheRepository.findAll();
	}

}
