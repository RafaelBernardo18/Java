package Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 perceba que aqui utilizo varias assinaturas @ que são da bilbioteca javax/jakarta 
 isso é necessario para fazer o mapeamento com o banco de dados
 ao analisar o arquivo persistance note que a ultima propriety o campo value pode ser diferente de acordo com a necessidade <property name="hibernate.hbm2ddl.auto" value="create"/>
 */

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id @Column(name =  "id")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "fornecedor")
	private String fornecedor;
	@Column(name = "preco")
	private float preco;
	@Column(name = "vencimento")
	private Date vencimento;
	
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
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = Date.valueOf(vencimento);
	}
	
}