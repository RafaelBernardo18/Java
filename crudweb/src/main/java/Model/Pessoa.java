package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Pessoa")
public class Pessoa implements Serializable {
	
	//serializable
	private static final long serialVersionUID = 1L;

	//construtor
	public Pessoa() {
		
	}
	
	//atributos mapeados
	@Id @Column(name =  "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name =  "nome")
	private String nome;
	@Column(name =  "sobrenome")
	private String sobrenome;
	@Column(name =  "idade")
	private int idade;
	@Column(name = "datanascimento")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	//metodos get set hash equals
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	} 

}