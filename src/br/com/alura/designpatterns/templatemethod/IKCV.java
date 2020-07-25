package br.com.alura.designpatterns.templatemethod;

import br.com.alura.designpatterns.chainofresponsability.Item;
import br.com.alura.designpatterns.chainofresponsability.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100ReisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReisNo(orcamento);
	}

}