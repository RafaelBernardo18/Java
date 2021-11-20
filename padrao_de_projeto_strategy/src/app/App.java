package app;

import pacotes.Contexto;
import pacotes.StrategyA;
import pacotes.StrategyB;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
                
        //criando objetos das classes de estrategia e para classe contexto
        //ja que vamos manipular o metodo pagamento para ambas as classe Strategy
        Contexto con = new Contexto();
 
        StrategyA objA = new StrategyA();
        StrategyB objB = new StrategyB();

        //manipulação entre o objeto composto strategy e a minha classe concreta de interesse
        con.strategy = objA;
        con.strategy = objB;

        //resultados
        System.out.println(objA.pagamento(5, 5));
        System.out.println(objB.pagamento(10, 10));

        //assim é simples de se genrencia/criar os novos metodos pagamentos()
        //pois seria necessario criar apenas uma nova classe StrateyC com a forma de pagamento adequada
    }
}