package br.padroes.projetos;

import br.padroes.projetos.singleton.SingletonEager;
import br.padroes.projetos.singleton.SingletonLazy;
import br.padroes.projetos.singleton.SingletonLazyHolder;
import br.padroes.projetos.strategy.*;

public class Main {

    public static void main(String[] args) {
        // Testando Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Testando Strategy
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
    }
}
