package app;

import pacotes.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        //criando obejtos
        Livro obj = new Livro("Scott Snyder", "Batman, a corte das corujas", "HQ", 189);

        //chamando memtodos
        obj.abrirLivro();
        obj.info();
        obj.passarPagina(20);
        obj.voltarPagina(10);
        obj.fecharLivro();
    }
}
