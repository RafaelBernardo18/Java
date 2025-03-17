package Entity;
import java.util.Date;

public class Contato {
	
	//construtor
	public Contato() {}
	
	//atributos
	private String nome;
	private int telefone;
	private Date nascimento;
	private String sexo;
	private String categoria;
	private String[] redesSociais;
	private boolean status;
	
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String[] getRedesSociais() {
		return redesSociais;
	}
	public void setRedesSociais(String[] redesSociais) {
		this.redesSociais = redesSociais;
	}
	
	public String getRedesSociaisFormatadas() {
	    String redesSociais = "";

	    if(getRedesSociais() != null) {
	      for(int cont = 0; cont < getRedesSociais().length; cont++) {
	        redesSociais += getRedesSociais()[cont];

	        if(cont < getRedesSociais().length - 1) {
	          redesSociais += "; ";
	        }

	      }
	    }

	    return redesSociais;
	 }
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
	
}