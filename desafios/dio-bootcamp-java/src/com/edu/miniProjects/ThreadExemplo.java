package com.edu.miniProjects;


public class ThreadExemplo {

	public static void main(String[] args) {
		GeradorPDF iniciarPDF = new GeradorPDF();
		Loading2 loading2 = new Loading2(iniciarPDF);

		iniciarPDF.start();
		loading2.start();
	}
}

class GeradorPDF extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Gerar PDF");
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PDF GERADO COM SUCESSO!");
	}
}

class Loading2 extends Thread{
	
	private Thread iniciarGeradorPDF;
	
	public Loading2(Thread iniciarGeradorPDF) {
		this.iniciarGeradorPDF = iniciarGeradorPDF;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(2000);
				if(!iniciarGeradorPDF.isAlive()) break;
				System.out.println("Gerando PDF...");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


