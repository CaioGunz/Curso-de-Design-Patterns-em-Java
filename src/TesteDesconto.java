import java.math.BigDecimal;

import br.com.caio.loja.descontos.CalculadoraDeDescontos;
import br.com.caio.loja.imposto.CalculadoraDeImpostos;
import br.com.caio.loja.imposto.ISS;
import br.com.caio.loja.orcamento.ItemOrcamento;
import br.com.caio.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
		
		CalculadoraDeDescontos calcular = new CalculadoraDeDescontos();
		System.out.println(calcular.calcular(primeiro));
	}

}
