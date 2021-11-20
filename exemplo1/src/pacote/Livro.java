package pacote;

public class Livro {
  
    //atributos
    String titulo;
    String autor;
    String genero;
    int paginas;

    //construtor da classe livro
    //setanto os valores para os atributos da classe livro
    public Livro(){
        this.setTitulo("Batman: A Piada Mortal");
        this.setAutor("Alan Moore");
        this.setGenero("Historias em quadrinhos");
        this.setPaginas(50);
    }
    
    //metodos get e set
    //é importante que cada classe tenham estes metodos especiais, pois ajudam a modificar/ler o valor dos atributos
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public int getPaginas(){
        return this.paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    //metodos
    //função info para mostrar as informações
    public void info(){
        System.out.println("o nome do livro é: " + this.titulo);
        System.out.println("o nome do outor é: " + this.autor);
        System.out.println("O genero do livro é: " + this.genero);
        System.out.println("quantidade de paginas: " + this.paginas);
    }    
}
