package br.com.alura.designpatterns.observer;

public class Impressora implements AcaoAposGerarNota  {
	
	public void executa(NotaFiscal nf) {
		System.out.println("nota impressa");
	}
	
}
