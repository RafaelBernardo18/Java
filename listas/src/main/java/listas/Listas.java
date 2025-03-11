package listas;

import java.util.ArrayList;

public class Listas {
	
	//construtor
	public Listas() {}
	
	//atributos
	private String item;
	private ArrayList<String> minhalista = new ArrayList<String>();

	//metodos get e set
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public ArrayList<String> getMinhaLista(){
		return this.minhalista;
	}
	public void setMinhaLista(ArrayList<String> minhalista) {
		this.minhalista = minhalista;
	}
	
	//metodos
	public void adicionar(String palavra) {
		setItem(palavra);
		minhalista.add(palavra);
	}
	
	public void editar(int posicao, String palavra) {
		minhalista.set(posicao, palavra);
	}
	
	public void remover(int posicao) {
		minhalista.remove(posicao);
	}
	
	public void limpar() {
		minhalista.removeAll(minhalista);
	}
	
	public void mostrar() {
		for(int i=0; i<minhalista.size();i++) {
			System.out.println(minhalista.get(i));
		}
	} 
}