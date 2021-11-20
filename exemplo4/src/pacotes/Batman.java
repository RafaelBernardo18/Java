package pacotes;

//herança da classe heroi
//assim é permitido que essa classe tenha acesso aos atributos e metodos da classe Heroi
public class Batman extends Heroi {
    
    //construtor da classe Batman
    public Batman(){
        this.setPeso(110.0f);
        this.setAltura(1.90f);
        this.setNome("Bruce Wayne");
    }

    //metodos abstratos
    @Override
    public void ataque(int a){
        if(a==1){
            System.out.println("batman lançou batarangs\n");
        }else if(a==2){
            System.out.println("batman utilizou golpe de Kravmaga\n");
        }else{
            System.out.println("batman não atacou\n");
        }
    }
}