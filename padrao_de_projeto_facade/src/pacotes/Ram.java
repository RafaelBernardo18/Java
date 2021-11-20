package pacotes;

public class Ram {

    //atributos
    public float dado;

    //metodos especiais get e set
    public float getDado(){
        return dado;
    }
    public void setDado(float dado){
        this.dado = dado;
    }

    //metodos concretos da classe Ram 
    public void carregando(float dado) {
        this.setDado(dado);
        System.out.println("carregando dados " + this.getDado());
    }      
}

