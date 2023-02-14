package br.com.caio.loja.situacao;

import java.math.BigDecimal;

import br.com.caio.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	
	public void finalizado(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
