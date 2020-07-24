package br.com.alura.designpatterns.chainofresponsability;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);

}
