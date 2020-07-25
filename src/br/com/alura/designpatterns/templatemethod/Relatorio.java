package br.com.alura.designpatterns.templatemethod;

import java.util.List;

public abstract class Relatorio {

	/*
	 * Relatórios e Template Method
	 * 
	 * Relatórios são muito parecidos: todos eles contêm cabeçalho, corpo, e rodapé.
	 * Existem dois tipos de relatórios: simples e complexos.
	 * 
	 * As diferenças são sutis: relatórios simples possuem cabeçalhos e rodapés de
	 * uma linha, apenas com o nome do banco e telefone, respectivamente; relatórios
	 * complexos possuem cabeçalhos que informam o nome do banco, endereço,
	 * telefone, e rodapés que informam e-mail, e a data atual.
	 * 
	 * Além disso, dada uma lista de contas, um relatório simples apenas imprime
	 * titular e saldo da conta. O relatório complexo exibe titular, agência, número
	 * da conta e saldo.
	 * 
	 * Use Template Method, e implemente o mecanismo de relatórios. Use dados falsos
	 * para os dados do banco.
	 */

	protected abstract void cabecalho();
	protected abstract void rodape();
	protected abstract void corpo(List<Conta> contas);

	protected void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

}
