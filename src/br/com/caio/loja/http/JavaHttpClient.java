package br.com.caio.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		
		try {
			URL urlDaApi = new URL(url);
			URLConnection connection = urlDaApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
		}
		
	}

}
