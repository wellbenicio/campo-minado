package br.com.wellyntonbenicio.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    private List<Campo> vizinhos = new ArrayList<>();
    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
}
