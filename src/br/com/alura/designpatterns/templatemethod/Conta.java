package br.com.alura.designpatterns.templatemethod;

public class Conta {

	private String nome;
	private int numero;
	private String agencia;
	private double saldo;

	public Conta(String nome, int numero, String agencia, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

}
