package com.apple.equipamentos.iphone;

import com.apple.equipamentos.iPod.ReprodutorMusical;
import com.apple.servicos.Phone.AparelhoTelefonico;
import com.apple.servicos.internet.NavegadorInternet;

public class iPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

	@Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA EM PAUSA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA");
    }

    @Override
    public void ligar() {
        System.out.println("REALIZANDO CHAMADA");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA SOLICITADA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
}

