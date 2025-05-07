package com.dio.modelandoiphone.interfaces;

public interface IAparelhoTelefonico {
	
	default void ligar(String numero) {
		 System.out.println("Ligando para: " + numero);
	 };
	 
	 default void atender(){
		 System.out.println("Telefone atendido");
	 };
	 
	 default void iniciarCorreioVoz(){
		 System.out.println("Correio de Voz Iniciado");
	 };

}
