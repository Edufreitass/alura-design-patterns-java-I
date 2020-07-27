package br.com.alura.designpatterns.observer;

public class EnviadorDeSms implements AcaoAposGerarNota  {

	public void executa(NotaFiscal nf) {
		System.out.println("enviei por sms");
	}
	
}
