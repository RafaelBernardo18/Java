package app;

import pacotes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //perceba que agora é obrigatorio eu passar o metodo Builder e criaPessoa que foram cirados na classe builder
        //mas agora fica facil a visualização do que está sendo instanciado em um novo objeto
        //este padrao de projeto é interessante para classes que possuem muitos atributos
        Pessoa obj = new Pessoa.Builder().nome("jotaro")
                                        .cor_cabelo("cabelo escuro")
                                        .altura(1.74f)
                                        .peso(70.1f)
                                        .biotipo("endomorfo")
                                        .criaPessoa();
        obj.mostraDados();
    }
}
