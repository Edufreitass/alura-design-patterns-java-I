package br.com.alura.designpatterns.templatemethod;

import br.com.alura.designpatterns.chainofresponsability.Imposto;
import br.com.alura.designpatterns.chainofresponsability.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
