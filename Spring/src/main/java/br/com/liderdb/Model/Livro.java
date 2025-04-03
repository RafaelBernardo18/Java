package br.com.liderdb.Model;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
@Table(name = "livro")
public class Livro {

	//atributos
	@Id @Column(name="isbn")
	private long isbn;
	@Column(name="titulo")
	private String titulo;
	@Column(name="edicao")
	private int edicao;
	@Column(name="autor")
	private String autor;
	@Column(name="categoria") @Enumerated(EnumType.STRING)
	private Categoria categoria;
	@Column(name="modelo") @Enumerated(EnumType.STRING)
	private Modelo modelo;
	
	//construtores
	public Livro(long isbn, String titulo, int edicao, String autor, Categoria categoria, Modelo modelo){
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setEdicao(edicao);
		this.setAutor(autor);
		this.setCategoria(categoria);
		this.setModelo(modelo);
	}
	
	public Livro() {}
	
	//metodos get e set
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
}
