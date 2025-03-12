package app;

import Entity.Produto;
import Factory.ProdutoFactory;

public class app {

	public static void main(String[] args) {
		Produto produto = new Produto();
		ProdutoFactory pf = new ProdutoFactory();
		
		produto.setId(3);
		produto.setNome("refrigerante editado");
		produto.setFornecedor("Pepsi");
		produto.setPreco(66.66f);
		produto.setVencimento("2025-10-30");
		
		
		//testando metodos
		//pf.inserir(produto);
		
		//pf.excluir(1);
		//pf.editar(produto);
		
		pf.mostrar();
	}

}
