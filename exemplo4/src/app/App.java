package app;

import pacotes.Batman;
import pacotes.Superman;

public class App {
    public static void main(String[] args) throws Exception {
        //criando objetos
        Batman bat = new Batman();
        Superman sup = new Superman();

        bat.descricao();
        bat.ataque(1);

        sup.descricao();
        sup.ataque(2);
    }
}
