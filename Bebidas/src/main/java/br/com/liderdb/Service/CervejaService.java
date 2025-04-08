package br.com.liderdb.Service;

import java.util.List;

import br.com.liderdb.Model.Cerveja;

public interface CervejaService {
	List<Cerveja> ListarCervejas();
	void SalvarCerveja(Cerveja cerveja);
	Cerveja ListarCervejaId(long id);
	void DeletarCervejaId(long id);
}