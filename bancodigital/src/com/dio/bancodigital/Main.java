package com.dio.bancodigital;

import com.dio.bancodigital.banco.Conta;
import com.dio.bancodigital.banco.ContaCorrente;
import com.dio.bancodigital.banco.ContaPoupanca;
import com.dio.bancodigital.clientes.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente Giselle = new Cliente();
		Giselle.setNome("Giselle");

		Conta cc = new ContaCorrente(Giselle);
		Conta poupanca = new ContaPoupanca(Giselle);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
