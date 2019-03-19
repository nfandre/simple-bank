package br.edu.ifsp.spo.lp1a3.simple_bank;

public class Conta {
	private String titular;
	private String numeroConta;
	
	
	
	public Conta(String titular, String numeroConta) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
}
