package com.edu.global;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Global {


	
	public static void main(String[] args) {
		Locale localeEn = new Locale("en", "GB");
		Locale localePt = new Locale("pt", "BR");
		Locale locale = Locale.getDefault();
		//Pegando o bundle correto através da localização da própria máquina do usuário
		ResourceBundle bundle = ResourceBundle.getBundle("resources.messages", locale);
		
		String headerMsg = bundle.getString("headerMsg");
		String hi = bundle.getString("hi");
		
		System.out.println(headerMsg);
		System.out.println(hi);
		
		
		 localeEn = new Locale("en", "GB");
		 localePt = new Locale("pt", "BR");
		 
		
		 LocalDateTime now = LocalDateTime.now();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd mm MMM yyyy", localeEn);
		 System.out.println(now.format(dtf));
		
		 
		 bundle = ResourceBundle.getBundle("resources.messages", localeEn);
		 
		 String offerPattern = bundle.getString("offer");
		 
		 NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
		 NumberFormat nfp = NumberFormat.getPercentInstance(Locale.FRANCE);
		 
		 String teaTxt = "Tea";
		 String priceTxt = nf.format(1.75);
		 String rateTxt = nfp.format(0.6);
		 
		String message = MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, LocalTime.now());
		
		System.out.println(message);
	
		 
		 Locale localeRU = new Locale("ru", "RU");
		
		 bundle = ResourceBundle.getBundle("resources.messages", localeRU);
		 offerPattern = bundle.getString("offer");
		String datePattern = bundle.getString("dateFormat");
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(localeRU);
		NumberFormat percentFormat = NumberFormat.getPercentInstance(localeRU);
		percentFormat.setMaximumFractionDigits(2);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
		
	}

	
}
