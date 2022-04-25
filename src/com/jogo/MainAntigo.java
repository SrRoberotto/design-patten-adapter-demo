package com.jogo;
import com.telaCheiaAntigo.*;

public class MainAntigo {

    public static class Main {
        public static void main(String[] args) {
            ITelaCheia jogoHD = new ResolucaoHD();
            ITelaCheia jogoSD = new ResolucaoSD();

            jogoHD.exibir();
            jogoSD.exibir();
        }
    }

}
