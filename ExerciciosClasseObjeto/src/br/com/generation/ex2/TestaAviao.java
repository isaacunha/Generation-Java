package br.com.generation.ex2;

import br.com.generation.ex2.*;

public class TestaAviao {

	public static void main(String[] args) {
		//Estanciando um objeto.... ---> Criar um objeto
		aviao aviao1 = new aviao();
		aviao aviao2 = new aviao();
		
		
		aviao1.NumeroPessoas = 144;
		aviao1.cor = "laranja";
		aviao1.empresa = "Gol";
				
		System.out.println(aviao1.NumeroPessoas);
		System.out.println(aviao1.cor);
		System.out.println(aviao1.empresa);
		aviao1.acelera();
		aviao1.freia();
		
		aviao2.NumeroPessoas = 137;
		aviao2.cor = "azul";
		aviao2.empresa = "Aeromeximo";
				
		System.out.println(aviao2.NumeroPessoas);
		System.out.println(aviao2.cor);
		System.out.println(aviao2.empresa);
		aviao2.acelera();
		aviao2.freia();


	}

}
