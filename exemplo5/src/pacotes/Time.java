package pacotes;

public class Time{
    
    //atributos
    private String nome;
    private boolean favorita;
    private int pontos;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;

    //construtor
    public Time(String nome, boolean favorita, int pontos, int jogos, int vitorias, int empates, int derrotas){
        this.setNome(nome);
        this.setFavorita(favorita);
        this.setPontos(pontos);
        this.setJogos(jogos);
        this.setVitorias(vitorias);
        this.setEmpates(empates);
        this.setDerrotas(derrotas);
    }

    //metodos get e set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getFavorita(){
        return this.favorita;
    }
    public void setFavorita(Boolean favorita){
        this.favorita = favorita;
    }

    public int getPontos(){
        return this.pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public int getJogos(){
        return this.jogos;
    }
    public void setJogos(int jogos){
        this.jogos = jogos;
    }

    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    //metodos
    public void ganharPrtida(){
        this.vitorias = this.vitorias + 1;
        this.pontos = this.pontos + 3;
        this.jogos = this.jogos + 1;  
        System.out.println("\nvitoria do time : " + this.nome + 
                            "\nnumeros de pontos atulizado para: " + this.pontos+
                            "\nnumero de vitorias atualizado para: " + this.vitorias + "\n");
    }
    public void empataPartida(){
        this.empates = this.empates + 1;
        this.pontos = this.pontos + 1;
        this.jogos = this.jogos + 1;
        System.out.println("\nempate do time : " + this.nome + 
                            "\nnumeros de pontos atulizado para: " + this.pontos+
                            "\nnumero de empates atualizado para: " + this.empates + "\n");

    }
    public void perderPartida(){
        this.derrotas = this.derrotas + 1;
        this.jogos = this.jogos + 1;
        System.out.println("\nderrota do time : " + this.nome + 
                            "\nnumeros de pontos atual: " + this.pontos+
                            "\nnumero de derrotas atualizado para: " + this.derrotas + '\n');
    }
}