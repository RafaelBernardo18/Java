package pacotes;

public class Contexto {

    //atributos
    //objeto composto da classe Strategy
    public Strategy strategy;

    //metodos get e set
    public Strategy getStrategy(){
        return strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    //metodo comcreto
    //servirá de base papra as outras classes Strategy
    public float pagamento(float x, float y){
        return strategy.pagamento(x,y);
    }
}