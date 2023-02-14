import java.math.BigDecimal;

import br.com.caio.loja.imposto.CalculadoraDeImpostos;
import br.com.caio.loja.imposto.ISS;
import br.com.caio.loja.orcamento.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal(100), 1);
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
		
		System.out.println(calc.calcular(orcamento, new ISS()));
	}

}
