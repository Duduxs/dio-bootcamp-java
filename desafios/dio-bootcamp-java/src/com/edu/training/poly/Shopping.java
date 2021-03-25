package com.edu.training.poly;

class Bone implements Test, Cloneable {
	public String oi = "aqui";
	
	void printaAe() {
		System.out.println("Printando na classe Bone =D ");
	}
	

}

class Touca extends Bone  {
	
	public String oi = "oi ";
	
	 void printaAe() {
		System.out.println("Printando na classe Touca =D");
	}

	 public void testando() {
		 System.out.println("Testando na touca");
	 }
}


public class Shopping {

	public static void main(String[] args) {
		Bone b = new Touca();
		if(b instanceof Touca) {
			Test x = new Touca();
			x.testando();
			System.out.println("OI");
		}
		
		Test x = new Touca();

		
	}


}
