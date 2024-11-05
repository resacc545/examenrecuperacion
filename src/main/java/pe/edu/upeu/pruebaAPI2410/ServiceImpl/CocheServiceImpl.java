package pe.edu.upeu.pruebaAPI2410.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pruebaAPI2410.Dao.CocheDao;
import pe.edu.upeu.pruebaAPI2410.Entity.Coche;
import pe.edu.upeu.pruebaAPI2410.Service.CocheService;

@Service
public class CocheServiceImpl implements CocheService {
	
	@Autowired
	private CocheDao cochedao;
	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return cochedao.create(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return cochedao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cochedao.delete(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return cochedao.read(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return cochedao.readAll();
	}

}
