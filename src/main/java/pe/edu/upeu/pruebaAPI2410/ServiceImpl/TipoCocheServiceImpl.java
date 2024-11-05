package pe.edu.upeu.pruebaAPI2410.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pruebaAPI2410.Dao.TipoCocheDao;
import pe.edu.upeu.pruebaAPI2410.Entity.TipoCoche;
import pe.edu.upeu.pruebaAPI2410.Service.TipoCocheService;

@Service
public class TipoCocheServiceImpl implements TipoCocheService {
	
	@Autowired
	private TipoCocheDao tipocochedao;
	@Override
	public TipoCoche create(TipoCoche c) {
		// TODO Auto-generated method stub
		return tipocochedao.create(c);
	}

	@Override
	public TipoCoche update(TipoCoche c) {
		// TODO Auto-generated method stub
		return tipocochedao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipocochedao.delete(id);
	}

	@Override
	public Optional<TipoCoche> read(Long id) {
		// TODO Auto-generated method stub
		return tipocochedao.read(id);
	}

	@Override
	public List<TipoCoche> readAll() {
		// TODO Auto-generated method stub
		return tipocochedao.readAll();
	}

}
