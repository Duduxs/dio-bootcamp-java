package com.edu.test.jdk10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;


public class InferenciaExemplo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://duduxs.github.io/portfolio/");
		URLConnection urlConnection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
		testar();
	}
	
	private static void testar() {
		
		var eDoTipoStringVisse = new String("Não me diga! :O");
		System.out.println(eDoTipoStringVisse);
	}
}
