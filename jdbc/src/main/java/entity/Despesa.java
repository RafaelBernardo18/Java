package entity;

//import java.time.LocalDate;
import java.sql.Date;

public class Despesa {
	
	//construtor
	public Despesa() {}
	
	//atributos
	private int id;
	private String nome;
	private float valor;
	private Date dia;
	
	//metodos get e set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float d) {
		this.valor = d;
	}
	
	public Date getDia() {
		return dia;
	}
	public void setDia(String data) {
		this.dia = Date.valueOf(data);
		
	}

}
