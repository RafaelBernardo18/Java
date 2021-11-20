package pacotes;

public class Pessoa {
    
    //atributos
    private String nome;
    private String cor_cabelo;
    private String biotipo;
    private float altura;
    private float peso;


    //construtor
     public Pessoa(String nome, String cor_cabelo, String biotipo,
        float altura, float peso){
        
        this.setNome(nome);
        this.setCor_cabelo(cor_cabelo);
        this.setBiotipo(biotipo);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    //metodos get e set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor_cabelo(){
        return this.cor_cabelo;
    }
    public void setCor_cabelo(String cor_cabelo){
        this.cor_cabelo = cor_cabelo;
    }

    public String getBiotipo(){
        return this.biotipo;
    }
    public void setBiotipo(String biotipo){
        this.biotipo = biotipo;
    }

    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }

    public void mostraDados(){
        System.out.println(nome + "\n" + cor_cabelo + "\n" + biotipo + "\n" + 
        altura + "\n" + peso + "\n");
    }

    //classe estatica interna paraa a aplicacao do builder
    public static class Builder {

        //repetindo atributos
        private String nome;
        private String cor_cabelo;
        private String biotipo;
        private float altura;
        private float peso;
 
        //construtor da classe builder
        public Builder(){
        
        }

        //metodos concretos para instanciarmos o objeto a partir da classe builder posteriormente
        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }
        public Builder cor_cabelo(String cor_cabelo){
            this.cor_cabelo = cor_cabelo;
            return this;
        }
        public Builder biotipo(String biotipo){
            this.biotipo = biotipo;
            return this;
        }
        public Builder altura(float altura){
            this.altura = altura;
            return this;
        }
        public Builder peso(float peso){
            this.peso = peso;
            return this;
        }

        //metodo para retornar ao objeto da classe pessoa
        public Pessoa criaPessoa(){
            return new Pessoa(nome, cor_cabelo, biotipo, altura, peso);
        }
    }
}
