package br.edu.ifsp.spo.lp1a3.simple_bank.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.simple_bank.Conta;

class ContaTests {
	String titular = "Joao da Silva";
	String numeroConta = "001-002";
	@Test
	void deve_consefuir_criar_uma_classe_conta_com_titular_e_numero() {
		//1. configura��o
		
					
		//2. execu��o
		Conta conta = new Conta(titular,numeroConta);
		
		//3. valida��o / asser��o
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroConta());
	}
	@Test
	void uma_nova_conta_deve_te_saldo_zero() {
		//1.configura��o
		
		
		//2. execu��o
		Conta conta = new Conta(titular,numeroConta);
		double saldo = conta.getSaldo();
				
		//3. valida��o / assers�o
		assertEquals(0, saldo);
	}
	
	@Test
	void devo_conseguir_depositar_um_valor_na_conta() {
		//1. configura��0
		double valor = 100;
		//2. execu��o
		Conta conta = new Conta(titular,numeroConta); 
		conta.depositar(valor);
		
		//3. valida��o / assers�o
		assertEquals(valor, conta.getSaldo());
	}

}
