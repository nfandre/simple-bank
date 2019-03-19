package br.edu.ifsp.spo.lp1a3.simple_bank;

public class Conta {
	private String titular;
	private String numeroConta;
	private double saldo;
	
	


	public Conta(String titular, String numeroConta) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
}
