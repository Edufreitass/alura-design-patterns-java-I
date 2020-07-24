package br.com.alura.designpatterns.strategy;

public class RealizadorDeInvestimentos {

	/*
	 * Estratégias para Investimentos
	 * 
	 * Muitas pessoas optam por investir o dinheiro das suas contas bancárias.
	 * Existem diversos tipos de investimentos, desde investimentos conservadores
	 * até mais arrojados.
	 * 
	 * Independentemente do investimento escolhido, o titular da conta recebe apenas
	 * 75% do lucro do investimento, pois 25% é imposto.
	 * 
	 * Implemente um mecanismo que invista o valor do saldo dela em um dos vários
	 * tipos de investimento e, dado o retorno desse investimento, 75% do valor é
	 * adicionado no saldo da conta.
	 * 
	 * Crie a classe RealizadorDeInvestimentos que recebe uma estratégia de
	 * investimento, a executa sobre uma conta bancária, e adiciona o resultado
	 * seguindo a regra acima no saldo da conta.
	 * 
	 * Os possíveis tipos de investimento são:
	 * 
	 * "CONSERVADOR", que sempre retorna 0.8% do valor investido;
	 * 
	 * "MODERADO", que tem 50% de chances de retornar 2.5%, e 50% de chances de
	 * retornar 0.7%;
	 * 
	 * "ARROJADO", que tem 20% de chances de retornar 5%, 30% de chances de retornar
	 * 3%, e 50% de chances de retornar 0.6%. Para verificar se a chance é maior que
	 * 30%, por exemplo, use:
	 * 
	 * boolean escolhido = new java.util.Random().nextDouble() > 0.30;
	 * 
	 */

	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);

		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}

}
