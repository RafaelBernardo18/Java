package br.com.liderdb.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="usuario", uniqueConstraints = @UniqueConstraint(columnNames="email"))
public class Usuario {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="nome")
	private String nome;
	@Column(name="email")
	private String email;
	@Column(name="senha")
	private String senha;
	@Column(name="role")
	private String role;
	
	//construtores
	public Usuario() {}

	public Usuario(String nome, String email, String senha) {
		super();
		this.nome=nome;
		this.email=email;
		this.senha=senha;
	}
	
	//get e seters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
}