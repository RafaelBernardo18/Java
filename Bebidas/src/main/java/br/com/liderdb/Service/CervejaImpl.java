package br.com.liderdb.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.liderdb.Model.Cerveja;
import br.com.liderdb.Repository.CervejaRepository;

@Service
public class CervejaImpl implements CervejaService {
	
	@Autowired
	private CervejaRepository cr;
	
	@Override
	public List<Cerveja> ListarCervejas(){
		return cr.findAll();
	}

	@Override
	public void SalvarCerveja(Cerveja cerveja) {
		this.cr.save(cerveja);
	}
	
	@Override
	public void DeletarCervejaId(long id) {
		this.cr.deleteById(id);
	}

	@Override
	public Cerveja ListarCervejaId(long id) {
		Optional < Cerveja > optional = cr.findById(id);
		Cerveja cerveja = null;
		if (optional.isPresent()) {
			cerveja = optional.get();
	    } else {
	    	throw new RuntimeException(" Nenhuma cerveja encontrada :: " + id);
	    }
		return cerveja;
	}
	

	
}