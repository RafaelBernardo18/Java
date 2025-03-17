package ManegedBean;

import Entity.Contato;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class ContatoMB {
	
	//atributo do tipo contato proveniente da classe contato
	private Contato contato = new Contato();
	
	//atributo do tipo lista para gerar os contatos
	private List<Contato> contatos = new ArrayList<Contato>();
	
	
	//metodo get e set
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public List<Contato> getContatos(){
		return contatos;
	}
	
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String adicionar() {
		contatos.add(contato);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		String msg = "contato adicionado: " + contato.getNome() + " - " + contato.getTelefone() + " - " + df.format(contato.getNascimento());
		
		FacesMessage fm = new FacesMessage(msg);
		FacesContext.getCurrentInstance().addMessage("msg", fm);
		contato = new Contato();
		return "index";
	}
}