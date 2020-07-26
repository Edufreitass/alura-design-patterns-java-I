package br.com.alura.designpatterns.state;

public class TesteDeDescontoExtra {

	/*
	 * Padrão State
	 * 
	 * Implemente o State para controlar os possíveis estados de um orçamento.
	 * 
	 * Um orçamento pode estar EM APROVAÇÃO, APROVADO, REPROVADO ou FINALIZADO.
	 * 
	 * Um orçamento começa com o estado de EM APROVAÇÃO.
	 * 
	 * O orçamento pode ter descontos aplicados a seu valor de acordo com o seu
	 * estado.
	 * 
	 * Se ele estiver em aprovação: 5%; se estiver aprovado, 2%; se estiver
	 * reprovado ou finalizado, nada de descontos extra.
	 * 
	 * A troca de estados de um orçamento também pode ocorrer, mas não pode haver
	 * troca de estados inválidos. Por exemplo, se a nota está em aprovação, ela só
	 * pode ir para aprovado ou reprovado; se ela está aprovada ou reprovada, ela só
	 * pode ir para finalizada.
	 * 
	 * Se ela está finalizada, ela não pode mais mudar de estado.
	 * 
	 * Escreva um método main que teste sua implementação.
	 */

	public static void main(String[] args) {

		Orcamento reforma = new Orcamento(500.0);

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.aprova();

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.finaliza();

		reforma.aplicaDescontoExtra();

	}

}
