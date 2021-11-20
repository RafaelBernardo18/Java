package app;

import pacote.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        //cirando objetos
        //perceba que agora eu sou obrigado a passar os parametros setados no construtor
        Livro obj1 = new Livro("Frank Millar", "O cavaleiro das trevas", "HQ", 203);
        Livro obj2 = new Livro("H.P. Lovecraft", "O chamado de cthulhu", "Terror", 60);

        //chamando metodo info da classe livro
        obj1.info();
        obj2.info();
    }
}
