package com.dio.modelandoiphone;

public class Main {

	public static void main(String[] args) {

		Iphone iphone7 = new Iphone();

		System.out.println("========= Funções de ReprodutorMusical:");
		iphone7.selecionarMusica("I Gotta Feeling - Black Eyed Peas");
		iphone7.tocar();
		iphone7.pausar();

		System.out.println("========= Funções de AparelhoTelefonico:");
		iphone7.ligar("1196856-9635");
		iphone7.atender();
		iphone7.iniciarCorreioVoz();
		
		System.out.println("========= Funções de NavegadorInternet:");
		iphone7.exibirPagina("www.google.com");
		iphone7.adicionarNovaAba();
		iphone7.atualizarPagina();

	}
}
