package br.com.alura.designpatterns.state;

public class Positivo implements EstadoDaConta {

	/*
	 * Em seguida, vamos implementar os dois estados possíveis: POSITIVO e NEGATIVO,
	 * de acordo com as regras dadas no enunciado:
	 */

	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;

		if (conta.saldo < 0)
			conta.estado = new Negativo();

	}

	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
