package br.com.alura.designpatterns.state;

public interface EstadoDaConta {

	/*
	 * Uma conta bancária realiza operações de saque e depósito diferentes, de
	 * acordo com seu estado atual.
	 * 
	 * Uma conta que está com saldo negativo, por exemplo, não aceita saques e são
	 * depositados apenas 95% do valor total de um depósito efetuado. Uma conta que
	 * está com saldo positivo aceita saques e o banco deposita 98% do valor total
	 * do depósito.
	 * 
	 * Use o State para representar os possíveis estados da conta e a sua transição
	 * de estado. Se uma conta passa a ter saldo positivo, fica com status POSITIVO.
	 * Caso contrário, fica com status NEGATIVO quando passa a ter saldo negativo.
	 * 
	 * Vamos começar criando a interface EstadoDaConta, que representa o estado da
	 * conta:
	 */

	void saca(Conta conta, double valor);

	void deposita(Conta conta, double valor);

}
