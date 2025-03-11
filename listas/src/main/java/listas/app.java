package listas;

import java.util.Scanner;

public class app {

	public static void main(String[] args) { 
		
		String palavra;
		String novaPalavra;
		int comando=0;
		int posicao=0;
		
		Listas obj = new Listas();
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		while (comando != 6) {
			System.out.println("operacoes com listas");
			System.out.println("1-adicionar nova palavra na lista");
			System.out.println("2-mostrar itens da lista");
			System.out.println("3-edite um item da lista");
			System.out.println("4-remova um item da lista");
			System.out.println("5-limpar lista");
			System.out.println("6-Sair");
			
			System.out.println("informe seu comando: ");
			comando = scan1.nextInt();
			
			if (comando == 1) {	
				System.out.println("Informe uma palavra/frase que quer adicionar a lista: ");
				palavra = scan2.nextLine();
				//metodo que adiciona na lista
				obj.adicionar(palavra);
				System.out.println("palavra adicionada");
			}else if(comando == 2){
				//metodo que mostra a lista inteira
				obj.mostrar();
			}else if(comando == 3) {
				System.out.println("Informe a posicao que deseja editar: ");
				posicao = scan3.nextInt();
				
				System.out.println("Novo valor: ");
				novaPalavra = scan1.next();
				
				//metodo que edita na lista 
				obj.editar(posicao, novaPalavra);
			}else if(comando==4) {
				System.out.println("Informe a posicao que deseja excluir : ");
				posicao = scan3.nextInt();
				
				//metodo para remover 
				obj.remover(posicao);
			}else if(comando==5) {
				//metodo para limpar a lista inteira 
				obj.limpar();
				
			}else if(comando==6){
				System.out.println("encerrando console");
				scan1.close();
				scan2.close();
				scan3.close();
				break;
			}
			
			else {
				System.out.println("não encontrado");
			}
				
		}
		
	}
}
