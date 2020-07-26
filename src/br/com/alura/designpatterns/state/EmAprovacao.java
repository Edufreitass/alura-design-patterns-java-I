package br.com.alura.designpatterns.state;

public class EmAprovacao implements EstadoDeUmOrcamento {

	/*
	 * Observe que os estados EM APROVAÇÃO e APROVADO dão desconto extra. O problema
	 * é que eles permitem com que esse desconto seja dado infinitamente.
	 * 
	 * Faça com que esse desconto seja aplicado apenas uma vez por estado. Na
	 * segunda aplicação de desconto, uma exceção deve ser lançada.
	 */
	
	private boolean descontoAplicado = false;

	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ir direto para finalizado!");
	}

}
