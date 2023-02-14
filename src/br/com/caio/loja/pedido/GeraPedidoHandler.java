package br.com.caio.loja.pedido;

import java.time.LocalDateTime;

import br.com.caio.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	// contrutor com injecao de dependencias: repository, services, etc.
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no Banco de Dados");
		System.out.println("Enviar um E-mail com dados do novo pedido");
	}

}
