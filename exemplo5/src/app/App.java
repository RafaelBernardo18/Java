package app;

import pacotes.Partida;
import pacotes.Time;

public class App {
    public static void main(String[] args) throws Exception {
        //criando obejtos
        Time obj1 = new Time("Chaos gaming", true, 9, 3, 3, 0, 0);
        Time obj2 = new Time("Team Liquid", false, 6, 3, 2, 0, 1);
        Partida p = new Partida();
     
        p.mostraStatus(obj1, obj2);
            
        p.verificaFavoritismo(obj1, obj2);
     
        obj1.ganharPrtida();
        obj2.perderPartida();
     
        p.mostraTabela(obj1);
        p.mostraTabela(obj2);
    }
}
