package pacotes;

public class Hd {

    //atributos
    public String arquivos;

    //metodos get e set
    public String getArquivos(){
        return arquivos;        
    }
    public void setArquivos(String arquivos){
        this.arquivos = arquivos;
    }

    //metodos concretos da classe Hd
    public void ler(String arquivo){
        this.setArquivos(arquivo);
        System.out.println("lendo arquivos em hd: " + this.getArquivos());
    }

    public void salvar(String arquivo){
        this.setArquivos(arquivo);
        System.out.println("salvando arquivos em hd: " + this.getArquivos());
    }
}
