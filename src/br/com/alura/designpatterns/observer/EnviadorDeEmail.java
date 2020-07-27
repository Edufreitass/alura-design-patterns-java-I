package br.com.alura.designpatterns.observer;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email");
	}
	
}
