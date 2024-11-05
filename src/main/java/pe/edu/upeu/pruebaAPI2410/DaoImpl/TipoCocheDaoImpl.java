package pe.edu.upeu.pruebaAPI2410.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pruebaAPI2410.Dao.TipoCocheDao;
import pe.edu.upeu.pruebaAPI2410.Entity.TipoCoche;
import pe.edu.upeu.pruebaAPI2410.Repository.TipoCocheRepository;

@Component
public class TipoCocheDaoImpl implements TipoCocheDao{
	@Autowired
	private TipoCocheRepository tipococheRepository;
	@Override
	public TipoCoche create(TipoCoche c) {
		// TODO Auto-generated method stub
		return tipococheRepository.save(c);
	}

	@Override
	public TipoCoche update(TipoCoche c) {
		// TODO Auto-generated method stub
		return tipococheRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipococheRepository.deleteById(id);
	}

	@Override
	public Optional<TipoCoche> read(Long id) {
		// TODO Auto-generated method stub
		return tipococheRepository.findById(id);
	}

	@Override
	public List<TipoCoche> readAll() {
		// TODO Auto-generated method stub
		return tipococheRepository.findAll();
	}

}
