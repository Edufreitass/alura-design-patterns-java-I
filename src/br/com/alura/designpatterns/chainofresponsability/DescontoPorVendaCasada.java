package br.com.alura.designpatterns.chainofresponsability;

public class DescontoPorVendaCasada implements Desconto {

	/*
	 * Implemente mais uma estratégia de desconto: 5% se tivermos LAPIS e CANETA na
	 * mesma compra.
	 * 
	 * Para isso, crie a classe DescontoPorVendaCasada. Adicione essa classe na
	 * cadeia, para suceder o DescontoPorMaisDeQuinhentosReais.
	 * 
	 * Para verificar se um item está no orçamento você pode usar uma função como a
	 * seguinte, na classe Orçamento:
	  	public boolean contemItemDeNome(String nomeDoItem) {
	        for (Item item : itens) {
	            if (item.getNome().equals(nomeDoItem)) return true;
	        }
	        return false;
    	}
	 */
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
