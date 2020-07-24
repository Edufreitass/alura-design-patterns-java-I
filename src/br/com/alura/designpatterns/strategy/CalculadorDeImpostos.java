package br.com.alura.designpatterns.strategy;

// classe que recebe o "strategy"
public class CalculadorDeImpostos {

	/*
	 * Utilidade da classe CalculadoraDeImpostos
	 * 
	 * A classe CalculadoraDeImpostos agora tem pouco código. Ela simplesmente
	 * invoca a estratégia de imposto e imprime através de um System.out.println()
	 * na tela.
	 * 
	 * Será que ela precisa continuar existindo?
	 * 
	 * Nesse exemplo, como a CalculadoraDeImpostos apenas exibe uma mensagem na
	 * tela, ela não é necessária. Mas agora imagine que, além de calcular o
	 * imposto, essa classe precisasse fazer mais alguma coisa, como por exemplo,
	 * alterar o status do Orçamento, ou notificar algum outro objeto desse valor
	 * calculado. Nesse caso, precisaríamos de uma classe para conter essa regra de
	 * negócios, e a classe CalculadoraDeImpostos seria uma boa candidata.
	 * 
	 * Repare que não há resposta correta; tudo sempre depende do contexto, do
	 * problema que estamos resolvendo.
	 */

	// método generico que implementa o "strategy"
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double resultado = impostoQualquer.calcula(orcamento);
		System.out.println(resultado);
	}

}
