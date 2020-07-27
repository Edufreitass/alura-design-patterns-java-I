package br.com.alura.designpatterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	/*
	 * Usando construtor
	 * 
	 * Ao invés do método adicionaAcao() receber as ações que serão executadas, que
	 * tal passar essa lista pelo construtor?
	 * 
	 * Implemente essa mudança e discuta quais as vantagens dela.
	 * 
	 * Recebendo a lista pelo construtor garantimos que, no momento da construção do
	 * builder, já teremos todas as ações que devem ser executadas após a geração da
	 * nota, e não haveria possibilidade dos clientes dessa classe a instanciarem
	 * sem definir essa lista primeiro.
	 * 
	 * Além do mais, caso você esteja usando algum framework de injeção de
	 * dependência, como Spring ou Guice, eles conseguirão injetar essa lista pelo
	 * construtor facilmente.
	 */

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;

	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	/*public NotaFiscalBuilder(List<AcaoAposGerarNota> lista) {
    	this.todasAcoesASeremExecutadas = lista;
  	}*/

	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;

	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);
		}

		return nf;
	}
	
	/*public NotaFiscal constroi() {
    	NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, valorTotal, impostos, data, observacoes);

	    for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
	      acao.executa(notaFiscal);
	    }

            return notaFiscal;
  	}*/

}
