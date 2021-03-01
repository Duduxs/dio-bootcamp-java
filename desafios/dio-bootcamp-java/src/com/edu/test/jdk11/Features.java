package com.edu.test.jdk11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Features {

	public static void main(String[] args) throws IOException, InterruptedException {

//		URL url = new URL("https://duduxs.github.io/portfolio/");
//		URLConnection urlConnection = url.openConnection();
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//		System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

		// Requisição
		HttpRequest request = HttpRequest.newBuilder().GET()
				.uri(URI.create("https://api.github.com/users/Duduxs"))
				.build();

		// Cliente

		HttpClient httpClient = HttpClient.newHttpClient();

		HttpResponse<String> response = httpClient.
				send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.statusCode());
		System.out.println(response.headers());
		System.out.println(response.body().replaceAll(",", ",\n"));

	}
}
