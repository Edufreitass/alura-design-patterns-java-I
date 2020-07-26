package br.com.alura.designpatterns.state;

public class Conta {

	/*
	 * Vamos fazer agora com que a classe Conta utilize os estados criados e, no
	 * momento de um saque ou depósito, ele invoque o comportamento que está no
	 * estado atual. Lembrando que ao inicializar uma conta seu estado será nulo,
	 * então temos que lembrar de atribuir um estado novo ou criar esse estado no
	 * construtor:
	 */

	protected double saldo;
	protected EstadoDaConta estado;

	public Conta() {
		estado = new Positivo();
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);
	}

}
