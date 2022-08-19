package br.com.campominado;

import br.com.campominado.model.Tabuleiro;
import br.com.campominado.view.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(8 , 8 ,6);

        new TabuleiroConsole(tabuleiro);


//        tabuleiro.abrir(3, 3 );
//        tabuleiro.alternarMarcacao(4,4);
//        tabuleiro.alternarMarcacao(4,5);
//
//        System.out.println(tabuleiro);

    }


}
