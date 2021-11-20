package pacotes;

public class Partida implements Classificacao {
    
    //atributos
    //objeto composto proveniente da classe time
    //permitira accessarmos os metodos da classe Time
    public Time time;  

    //metodos get e set
    public Time getTime(){
        return this.time;
    }
    public void setTime(Time time){
        this.time = time;
    }

    //metodos abstratos
    @Override
    public void mostraStatus(Time h, Time v){
        System.out.println("\ntime da casa: " + h.getNome() + "\ntime visitante: " + v.getNome() + 
                            "\npartida em andamento...\n");
    }

    @Override
    public void mostraTabela(Time time){
        System.out.println("\nnome: " + time.getNome() + "\npontos: " + time.getPontos() +
                           "\njogos: " + time.getJogos() + "\nvitorias: " + time.getVitorias() + 
                           "\nempates: " + time.getEmpates() + "\nderrotas: " + time.getDerrotas() + "\n");
    }

    //metodos concretos
    public void verificaFavoritismo(Time h, Time v){
        if(h.getFavorita() == true && v.getFavorita() == false){
            System.out.println("time da casa é o favorito");
        }else if(h.getFavorita() == false && v.getFavorita() == true){
            System.out.println("time visitante é o favorito");
        }else{
            System.out.println("não identificado");
        } 
    }
}
