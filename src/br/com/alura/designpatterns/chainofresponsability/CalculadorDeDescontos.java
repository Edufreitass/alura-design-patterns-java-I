package br.com.alura.designpatterns.chainofresponsability;

public class CalculadorDeDescontos {

	/*
	 * Utilidade da classe CalculadorDeDescontos
	 * 
	 * Será que a classe CalculadorDeDescontos é realmente necessária? Discuta a
	 * utilidade dela.
	 * 
	 * Agora que implementamos o Chain of Responsibility, temos cada uma das
	 * responsabilidades separadas em uma classe, e uma forma de unir essa corrente
	 * novamente. Veja a flexibilidade que o padrão nos deu: podemos montar a
	 * corrente da forma como quisermos, e sem muitas complicações.
	 * 
	 * Mas precisamos de uma classe que monte essa corrente na ordem certa, com
	 * todos os descontos necessários. Por isso que optamos pela classe
	 * CalculadorDeDescontos. Ela poderia ter qualquer outro nome como
	 * CorrenteDeDescontos, e assim por diante, mas fato é que em algum lugar do seu
	 * código você precisará montar essa corrente.
	 */

	public double calcula(Orcamento orcamento) {

		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhetosReais();
		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);

		return d1.desconta(orcamento);

	}

}
