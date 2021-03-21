package com.edu.training.poly;

public class Data {

	private final int dia;
	private final int mes;
	private final int ano;

	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String formatarData() {
		return dia + "/" + mes + "/" + ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

}
