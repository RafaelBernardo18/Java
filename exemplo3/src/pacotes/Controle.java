package pacotes;

//isto é uma interface, é utilizada realizar encapsulamento de metodos abstrados
//a interface não possui atributos e nem construtor 
//permite apenas metodos abstratos
//classes podem herdar multiplas interfaces
//é interessante utilizar uma interface quando muitas classes pecisam de seus metodos de assinatura
public interface Controle{
    //metodos abstratos
    public abstract void abrirLivro();
    public abstract void fecharLivro();
    public abstract void passarPagina(int n);
    public abstract void voltarPagina(int n);
}