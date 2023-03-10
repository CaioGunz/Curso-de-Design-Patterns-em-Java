import java.math.BigDecimal;
import java.util.Arrays;

import br.com.caio.loja.pedido.GeraPedido;
import br.com.caio.loja.pedido.GeraPedidoHandler;
import br.com.caio.loja.pedido.acao.EnviarEmailPedido;
import br.com.caio.loja.pedido.acao.LogDePedido;
import br.com.caio.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedido {

	public static void main(String[] args) {

		String cliente = "Rodrigo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new EnviarEmailPedido(),
				new SalvarPedidoNoBancoDeDados(),
				new LogDePedido()));
		handler.execute(gerador);
	}

}
