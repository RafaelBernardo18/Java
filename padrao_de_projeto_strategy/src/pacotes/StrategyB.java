package pacotes;

//herança da classe strategy para utilizarmos o metodo desta classe
public class StrategyB implements Strategy{
    
    //metodo concreto para estrategia A
    public float pagamento(float x, float y){
        return x+y;
    }
}