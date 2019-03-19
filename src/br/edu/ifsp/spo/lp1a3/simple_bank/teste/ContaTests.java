package br.edu.ifsp.spo.lp1a3.simple_bank.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.simple_bank.Conta;

class ContaTests {
	String titular = "Joao da Silva";
	String numeroConta = "001-002";
	double saldo;
	
	@Test
	void deve_consefuir_criar_uma_classe_conta_com_titular_e_numero() {
		//1. configuração
		
					
		//2. execução
		Conta conta = new Conta(titular,numeroConta);
		
		//3. validação / asserção
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroConta());
	}
	@Test
	void uma_nova_conta_deve_te_saldo_zero() {
		//1.configuração
		String titular = "Joao da Silva";
		String numeroConta = "001-002";
		double conta;
	
		
		//2. execução
		
		//3. validação / assersão
	}
}
