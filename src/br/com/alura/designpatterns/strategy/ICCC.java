package br.com.alura.designpatterns.strategy;

public class ICCC implements Imposto {

	/**
	 * Implemente mais uma estratégia de cálculo de imposto.
	 * 
	 * Crie o imposto que se chama ICCC, que retorna 5% do valor total caso o
	 * orçamento seja menor do que R$ 1000,00 reais, 7% caso o valor esteja entre R$
	 * 1000 e R$ 3000,00 com os limites inclusos, ou 8% mais 30 reais, caso o valor
	 * esteja acima de R$ 3000,00.
	 * 
	 * Escreva um método main que testa sua implementação.
	 */

	@Override
	public double calcula(Orcamento orcamento) {

		double valor = orcamento.getValor();

		// 1ª forma
		if (valor < 1000) {
			return (valor * 5) / 100;
		} else if (valor >= 1000 && valor <= 3000) {
			return (valor * 7) / 100;
		} else {
			return ((valor * 8) + 30) / 100;
		}

		// 2ª forma
		/* if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.08 + 30;
		} */
		
	}

}
