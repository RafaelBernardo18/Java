package ManagedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import Model.Pessoa;
import Dao.PessoaDao;

@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaMB {
	
	//esses objetos vem das minhas outras classes
	private Pessoa pessoa = new Pessoa();
	private PessoaDao<Pessoa> pessoaDao = new PessoaDao<Pessoa>();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>(); //esse objeto pessoas vai ser usado para um select onde vou montar um datatable
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public PessoaDao<Pessoa> getPessoaDao() {
		return pessoaDao;
	}
	public void setPessoaDao(PessoaDao<Pessoa> pessoaDao) {
		this.pessoaDao = pessoaDao;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	//meus metodos chamados pelo bean no jsf
	public String salvar() {
		//metodo merge já serve para inserir e editar
		//tambem existe o metodo persist para inserir um novo objeto
		pessoa = pessoaDao.merge(pessoa); 
		carregarPessoas();
		return "";
	}
	
	public String remove() {
		pessoaDao.deletePorId(pessoa);
		pessoa = new Pessoa();
		carregarPessoas();
		return "";
	}
	
	@PostConstruct
	public void carregarPessoas() { //carregar as pessoas
		pessoas = pessoaDao.getListEntity(Pessoa.class);
	}
	
}
