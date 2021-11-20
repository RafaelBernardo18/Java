package pacotes;

//perceba que diferente dos outros exemplos esta classe livro agora estará utilizando a interface controle
public class Livro implements Controle{
    
    //atributos
    String autor;
    String titulo;
    String genero;
    int paginas;
    int atual;

    //construtor da classe livro
    public Livro(String autor, String titulo, String genero, int paginas){
        this.setAutor(autor);
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setPaginas(paginas);
        this.setAtual(1);
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

    public int getAtual(){
        return this.atual;
    }
    public void setAtual(int atual){
        this.atual = atual;
    }

    //metodo para mostrar informaçoes
    public void info(){
        System.out.println("autor: " + this.autor);
        System.out.println("titulo da obra: " + this.titulo);
        System.out.println("genero: " + this.genero);
        System.out.println("numero de paginas: " + this.paginas);
        System.out.println("pagina autual: " + this.atual + "\n");
    }

    //metodos metodos abstratos
    @Override
    public void abrirLivro(){
        System.out.println("Você abriu o livro " + this.getTitulo() + " para começar sua leitura");
    }

    @Override
    public void fecharLivro(){
        System.out.println("você fecheu o livro " + this.getTitulo() + " para guardalo\n");
    }

    @Override
    public void passarPagina(int n){
        System.out.println("Avançando paginas...");
        this.atual = this.atual + n;
        System.out.println("Sua pagina atual: " + this.getAtual() + "\n");
    }

    @Override
    public void voltarPagina(int n){
        System.out.println("Voltando paginas..");
        this.atual = this.atual - n;
        System.out.println("Sua pagina atual: " + this.getAtual() + "\n");
    }

}
