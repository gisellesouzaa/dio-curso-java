package com.dio.modelandoiphone.interfaces;

public interface INavegadorInternet {

	default void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	}

	default void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	}

	default void atualizarPagina() {
		System.out.println("Página atualizada");
	}

}
