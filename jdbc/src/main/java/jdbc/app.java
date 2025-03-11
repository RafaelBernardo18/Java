package jdbc;

import dao.DaoDespesa;
import entity.Despesa;

public class app {

	public static void main(String[] args) {
		
		DaoDespesa daodespesa = new DaoDespesa();
		Despesa despesa = new Despesa();
		
		
		despesa.setId(3);
		despesa.setNome("gas");
		despesa.setValor(140.50f);
		despesa.setDia("2025-01-04");
		
		//daodespesa.inserir(despesa);
		
		//daodespesa.excluir(60);
		
		//daodespesa.mostrar();
		
		daodespesa.editar(despesa);
		
	}

}
