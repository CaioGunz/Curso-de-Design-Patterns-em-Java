import java.math.BigDecimal;

import javax.imageio.spi.RegisterableService;

import br.com.caio.loja.http.JavaHttpClient;
import br.com.caio.loja.orcamento.Orcamento;
import br.com.caio.loja.orcamento.RegistroDeOrcamento;

public class TesteAdpter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		
		registro.registrar(orcamento);
	}
	
}
