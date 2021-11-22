package com.app;

import com.pacote.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;


public class App {
	public static void main(String[] args) throws SQLException {
		
		//como o singleton permite uma instancia unica para a classe com o metodo getInstance
		//não podemos mais instancia um objeto de uma forma convencional
		//entao precisaremos passar o metodo getInstance verificar/criar um novo objeto
		//esse padrao é interessante para bando de dados pois evita a conexao e deconexao frequente e estressando menos o banco
		Singleton obj = Singleton.getInstance();
		
		
		//demonstração de um SELECT feito no banco de dados
		//o banco está localizado na pasta recursos junto com o driver de conexao
		Connection novo_obj = obj.getConexao();
		
		ResultSet rsClient = novo_obj.createStatement().executeQuery("SELECT *FROM batman");
		
		while(rsClient.next()) {
			System.out.println("Nome: " + rsClient.getString("nome") +
								"\nParceiro: " + rsClient.getString("parceiro") + 
								"\nafiliacao: " + rsClient.getString("afi") + 
								"\npoderes: " + rsClient.getString("poderes")); 
		}
	}
}