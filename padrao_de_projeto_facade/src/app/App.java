package app;

import pacotes.Facade;

public class App {
    public static void main(String[] args) throws Exception {
        //novo objeto
        Facade obj = new Facade();

        obj.iniciarComputador();
        obj.freezeCpu();
        obj.desligarComputador();
    }
}
