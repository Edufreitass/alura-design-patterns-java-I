package br.com.alura.designpatterns.chainofresponsability;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);

}
