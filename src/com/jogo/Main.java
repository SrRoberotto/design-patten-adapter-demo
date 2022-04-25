package com.jogo;
import com.exibicaoModerna.*;
import com.telaCheiaAntigo.*;

public class Main {
    public static void main(String[] args) {
        ITelaJogo jogoFullHD = new ResolucaoFHD();
        ITelaCheia jogoHD = new ResolucaoHD();
        ITelaCheia jogoSD = new ResolucaoSD();

        jogoFullHD.exibirJanela();
        jogoFullHD.exibirTelaCheia();

        jogoHD.exibir();
        jogoSD.exibir();

        //Jogo adaptado para janela durante a construção
        ITelaJogo adaptadorHD = new adaptarExibicoes(jogoHD);
        ITelaJogo adaptadorSD = new adaptarExibicoes(jogoSD);

        adaptadorHD.exibirJanela();
        adaptadorHD.exibirTelaCheia();

        adaptadorSD.exibirJanela();
        adaptadorSD.exibirTelaCheia();

    }
}
