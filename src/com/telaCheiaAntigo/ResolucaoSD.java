package com.telaCheiaAntigo;

public class ResolucaoSD implements ITelaCheia {
    private int[] resolucao;

    public ResolucaoSD(){
        this.resolucao = new int[]{720, 480};
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo jogo na resolucao "+this.resolucao[0] + " x " + this.resolucao[1]);
    }

    @Override
    public int[] getResolucao(){
        return this.resolucao;
    }
}
