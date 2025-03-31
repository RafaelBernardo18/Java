package ManagedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Model.Produto;
import Dao.GenericDao;

@SessionScoped
@ManagedBean(name = "produtoBean")
public class ProdutoMB {

	private Produto produto = new Produto(); //instancia do meu package model
	private long codigo; // usado para tratar registro quando passo de uma pagina para outra
	private List<Produto> produtos = new ArrayList<Produto>(); //instancia de uma lista para os os produtos
	private GenericDao<Produto> dao = new GenericDao<Produto>(); //instancia da minha classe dao recebendo a classe produto
		
	//metodos get e set
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public GenericDao<Produto> getDao() {
		return dao;
	}
	public void setDao(GenericDao<Produto> dao) {
		this.dao = dao;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
		mostarProdutos();
	}
	
	//esse atributo codgio é especial para busca um produto especifico
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
		System.out.println(codigo);
		if (codigo >= 0) {
			produto = (Produto) dao.getEntityId(Produto.class, codigo);
		}
	}
	
	//navegacao
	public String navegarEdit() {
		return "edit?faces-redirect=true";
	}
	public String voltarIndex() {
		return "index?faces-redirect=true";
	}
	public String navegarNovoProduto() {
		return "novo?faces-redirect=true";
	}
	
	
	//mostrar
	@PostConstruct
	public void mostarProdutos() {
		produtos = dao.getListEntity(Produto.class);
	}
	
	//atualizar
	public String atualizarProduto() {
		produto = dao.setEntity(produto);
		mostarProdutos();
		return "index?faces-redirect=true";
	}
	
	//excluir
	public String removerProduto() {
		dao.deleteEntity(produto);
		produto = new Produto();
		produtos = dao.getListEntity(Produto.class);
		return "index";
	}
	
	//inserir
	public String inserirProduto() {
		dao.includeEntity(produto);
		produto = new Produto();
		produtos = dao.getListEntity(Produto.class);
		return "index?faces-redirect=True";
	}
		
}