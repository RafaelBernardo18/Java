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
@Table(name = "Produto")
public class Produto implements Serializable {

	//serializable
	private static final long serialVersionUID = 1L;
	
	//construtor
	public Produto() {}
	
	//atributos e suas anotacoes
	@Id @Column(name = "codigo") @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long codigo;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "codauxiliar")
	private int codauxiliar;
	@Column(name="preco")
	private float preco;
	@Column(name="fornecedor")
	private String fornecedor;
	@Column(name="dataCadastro") @Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	//metodos get e set
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodauxiliar() {
		return codauxiliar;
	}

	public void setCodauxiliar(int codauxiliar) {
		this.codauxiliar = codauxiliar;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}
	
}
