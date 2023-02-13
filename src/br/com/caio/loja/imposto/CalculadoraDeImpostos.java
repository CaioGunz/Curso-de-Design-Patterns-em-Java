package br.com.caio.loja.imposto;

import java.math.BigDecimal;

import br.com.caio.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
	
}
