import java.math.BigDecimal;

import br.com.caio.loja.pedido.GeraPedido;
import br.com.caio.loja.pedido.GeraPedidoHandler;

public class TestePedido {

	public static void main(String[] args) {

		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
		handler.execute(gerador);
		
	}

}
