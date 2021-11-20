package pacotes;

//herança da classe heroi
//assim é permitido que essa classe tenha acesso aos atributos e metodos da classe Heroi
public class Superman extends Heroi {
    
    //construtor da classe Superman
    public Superman(){
        this.setPeso(107.0f);
        this.setAltura(1.90f);
        this.setNome("Kal-El");
    }

    //metodos abstratos
    @Override
    public void ataque(int a){
        if(a==1){
            System.out.println("Superman utilizou visao de calor\n");
        }else if(a==2){
            System.out.println("Superma utilizou super soco\n");
        }else{
            System.out.println("Superman não atacou\n");
        }
    }
}