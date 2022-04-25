package com.exibicaoModerna;
import com.telaCheiaAntigo.ITelaCheia;

public class adaptarExibicoes implements ITelaJogo {
    private int[] resolucao;
    private ITelaCheia telaAdaptada; //adaptee

    public adaptarExibicoes(ITelaCheia tela){
        this.telaAdaptada = tela;
        this.resolucao = tela.getResolucao();
    }

    @Override
    public void exibirJanela() {
        System.out.println("Exibindo jogo em janela na resolucao "+this.resolucao[0] + " x " + this.resolucao[1]);
    }

    @Override
    public void exibirTelaCheia() {
        this.telaAdaptada.exibir();
    }

}
