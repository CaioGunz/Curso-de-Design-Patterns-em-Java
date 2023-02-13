package br.com.caio.loja.imposto;

import java.math.BigDecimal;

import br.com.caio.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular (Orcamento orcamento);
	
}
