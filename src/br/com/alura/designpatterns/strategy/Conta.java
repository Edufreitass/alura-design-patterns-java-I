package br.com.alura.designpatterns.strategy;

public class Conta {

	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
