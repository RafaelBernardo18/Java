package app;

import pacote.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        //este codigo é um exemplo simples de orientação a objetos
        //perceba que nossa classe livro só tem um metodo chamado info()
        
        //criando objeto
        //lembrando que ele precisa tem o mesmo nome da classe cirada
        Livro obj = new Livro();

        //chamando o metodo info criado na classe livro.java
        obj.info();  
    }
}
