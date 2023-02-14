package br.com.caio.loja.descontos;

import java.math.BigDecimal;

import br.com.caio.loja.imposto.Imposto;
import br.com.caio.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {		
		return BigDecimal.ZERO;
	}
	
}
