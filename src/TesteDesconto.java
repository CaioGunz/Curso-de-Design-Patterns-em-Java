import java.math.BigDecimal;

import br.com.caio.loja.descontos.CalculadoraDeDescontos;
import br.com.caio.loja.imposto.CalculadoraDeImpostos;
import br.com.caio.loja.imposto.ISS;
import br.com.caio.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 4);
		CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
		
		System.out.println(calc.calcular(orcamento));
	}

}
