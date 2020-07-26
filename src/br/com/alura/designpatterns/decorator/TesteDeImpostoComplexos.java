package br.com.alura.designpatterns.decorator;

public class TesteDeImpostoComplexos {

	public static void main(String[] args) {

		Imposto iss = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);

	}

}
