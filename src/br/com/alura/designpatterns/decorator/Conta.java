package br.com.alura.designpatterns.decorator;

import java.util.Calendar;

public class Conta {

	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private double valor;
	private Calendar dataAbertura;

	public Conta(String nome, int numero, String agencia, double saldo, double valor, Calendar dataAbertura) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.valor = valor;
		this.dataAbertura = dataAbertura;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getValor() {
		return valor;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

}
