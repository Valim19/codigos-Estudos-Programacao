// &apikey=7b157eb3
// https://web.postman.co/workspace/My-Workspace~436953c6-5150-4879-8a90-6d48feed596f/request/create?requestId=5b193174-c80c-4c13-a73c-7f9179588005

package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalComBusca {
	public static void main(String[] args) throws IOException, InterruptedException {
		@SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um filme para a busca: ");
		
		var busca = leitura.nextLine();
		
		String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=7b157eb3";
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
							  .uri(URI.create(endereco))
							  .build();
		
		HttpResponse<String> response = client
										.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();		
		System.out.println(json);
		
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		TituloOMDB meuTituloOMDB = gson.fromJson(json , TituloOMDB.class);
		System.out.println(meuTituloOMDB);
		Titulo meuTitulo = new Titulo(meuTituloOMDB);
		System.out.println("Titulo já convertido " + meuTitulo);
	}
	
}
