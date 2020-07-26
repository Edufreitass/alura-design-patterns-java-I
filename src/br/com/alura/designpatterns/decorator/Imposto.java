package br.com.alura.designpatterns.decorator;

public abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto() {

	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calcula(orcamento);
	}

}
