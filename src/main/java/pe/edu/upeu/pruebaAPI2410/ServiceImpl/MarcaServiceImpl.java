package pe.edu.upeu.pruebaAPI2410.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pruebaAPI2410.Dao.MarcaDao;
import pe.edu.upeu.pruebaAPI2410.Entity.Marca;
import pe.edu.upeu.pruebaAPI2410.Service.MarcaService;
@Service
public class MarcaServiceImpl implements MarcaService {
	
	@Autowired
	private MarcaDao marcadao;
	@Override
	public Marca create(Marca c) {
		// TODO Auto-generated method stub
		return marcadao.create(c);
	}

	@Override
	public Marca update(Marca c) {
		// TODO Auto-generated method stub
		return marcadao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		marcadao.delete(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return marcadao.read(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return marcadao.readAll();
	}

}
