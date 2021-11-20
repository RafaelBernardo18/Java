package pacote;

public class Livro {
    	    
    //atributos
    String autor;
    String titulo;
    String genero;
    int paginas;

    //construtor da classe livro
    //agora vamos da um pouco mais de dinamismo passado para o construtor parametros obrigatorios
    public Livro(String autor, String titulo, String genero, int paginas){
        this.setAutor(autor);
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setPaginas(paginas);
    }

    //metodos get e set
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
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

    //metodo para mostrar informaçoes
    public void info(){
        System.out.println("autor: " + this.autor);
        System.out.println("titulo da obra: " + this.titulo);
        System.out.println("genero: " + this.genero);
        System.out.println("numero de paginas: " + this.paginas + "\n");
    }
}
