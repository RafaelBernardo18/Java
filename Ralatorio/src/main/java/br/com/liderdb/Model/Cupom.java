package br.com.liderdb.Model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Cupom {
	
	private String nome;
	private int idade;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	private float desconto;
	
	public Cupom() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	
}
