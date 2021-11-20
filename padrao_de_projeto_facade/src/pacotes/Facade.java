package pacotes;

public class Facade {
    
    //atributos 
    //objetos compostos provenientes das outras classe
    private Cpu cpu;
    private Hd hd;
    private Ram ram;

    //construtor
    //neste construtor vamos instaciar um novo objeto para cada classe com objeto composto na classe facade
    public Facade(){
        this.cpu = new Cpu();
        this.hd = new Hd();
        this.ram = new Ram();
    }

    //metodos concretos da classe facade
    //perceba que em cada metodo é chamado apenas a função de interesse para aquele comportamento
    public void iniciarComputador(){
        ram.carregando(0.66f);
        cpu.jump();
        cpu.excute();
        System.out.println("processos comcluidos... inicializando computador");
    }

    public void freezeCpu(){
        cpu.freeze();
        System.out.println("processos de freeze da cpu concluidos");
    }

    public void desligarComputador(){
        ram.carregando(0.66f);
        cpu.freeze();
        hd.ler("lendo arquivo");
        hd.salvar("salvando arquivo");
        System.out.println("procedimentos concluidos... desligando computador");
    }
}