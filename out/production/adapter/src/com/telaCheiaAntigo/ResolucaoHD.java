package com.telaCheiaAntigo;

public class ResolucaoHD implements ITelaCheia {
    private int[] resolucao;

    public ResolucaoHD(){
        this.resolucao = new int[]{1280, 720};
    }

    @Override
    public void exibir() {
        System.out.printf("Exibindo jogo na resolucao %d x %d%n", this.resolucao[0], this.resolucao[1]);
    }

    @Override
    public int[] getResolucao(){
        return this.resolucao;
    }
}
