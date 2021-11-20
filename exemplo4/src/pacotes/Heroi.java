package pacotes;

//diferente da interface uma clcasse abstrata pode ter metodos abstratos e concretos
//tambem pode possuir atributos ou construtores
//é interessante utilizar para projetos que precisam de herança pois pode existir classes que possuem comportamentos em comun
public abstract class Heroi {
    
    //atributos
    protected float peso;
    protected float altura;
    protected String nome;

    //metodos get e set
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public String geNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //metodos
    public void descricao(){
        System.out.println("informações do heroi: ");
        System.out.println("Peso aproximado: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Nome: " + this.nome + '\n');
    }

    //metodos abstratos
    public abstract void ataque(int a);

}