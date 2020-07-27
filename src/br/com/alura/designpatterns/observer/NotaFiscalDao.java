package br.com.alura.designpatterns.observer;

public class NotaFiscalDao implements AcaoAposGerarNota  {

	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco");
	}
	
}
