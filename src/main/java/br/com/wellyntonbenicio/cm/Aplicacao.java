package br.com.wellyntonbenicio.cm;

import br.com.wellyntonbenicio.cm.modelo.Tabuleiro;
import br.com.wellyntonbenicio.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
