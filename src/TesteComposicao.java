import java.math.BigDecimal;

import br.com.caio.loja.orcamento.ItemOrcamento;
import br.com.caio.loja.orcamento.Orcamento;
import br.com.caio.loja.orcamento.OrcamentoProxy;

public class TesteComposicao {

	public static void main(String[] args) {
		
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.aprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}
	
}
