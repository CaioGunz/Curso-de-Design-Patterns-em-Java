package br.com.caio.loja.descontos;

import java.math.BigDecimal;

import br.com.caio.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular (Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
								new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
										new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}