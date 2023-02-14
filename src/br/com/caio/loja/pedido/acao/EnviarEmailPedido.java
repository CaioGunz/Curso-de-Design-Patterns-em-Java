package br.com.caio.loja.pedido.acao;

import br.com.caio.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando E-mail com dados do pedido");
	}
	
}
