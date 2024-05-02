package com.apple.estabelecimento;

import com.apple.equipamentos.iphone.iPhone;

public class Fabrica {

	public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        meuiPhone.selecionarMusica();
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
	}

}
