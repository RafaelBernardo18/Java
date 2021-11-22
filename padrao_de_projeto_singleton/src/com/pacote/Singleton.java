package com.pacote;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {
	
	//atributos da classe singleton
	//aqui tambem há atributos para acessarmos um banco de dados
	private static Singleton instance;
	private Connection conexao = null; //objeto composto proveniente do driver para conexao de banco de dados 
	private String url = "jdbc:mysql://192.168.15.5:3306/heroi";
	private String nome = "rafael";
	private String senha = "senha";
	
	
	//construtor da classe singleton
	//há dois condicionais try/catch para acessarmos o drive e conectar ao banco
	private Singleton() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver de conexao ok\n");
		} catch(Exception e) {
			System.out.println("driver não encotrado: " + e);
		} 
		
		try {
			this.conexao = DriverManager.getConnection(url, nome, senha);
			System.out.println("conecato ao banco de dados\n");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	//metodo do padrao de projeto Singleton
	//perceba que esse metodo vai permitir a instancia da classe uma unica vez
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
				if(instance==null) {
					instance = new Singleton();
				}
			}
		}
	return instance;
	}
	
	
	//metodo get para o atributo conexao ao banco
	public Connection getConexao() {
		return this.conexao;
	}
}