package br.com.generation.ex1;

import br.com.generation.ex1.*;

public class TestaCliente {

	public static void main(String[] args) {
		//Estanciando um objeto.... ---> Criar um objeto
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		cliente1.nome = "Luiz Guilherme";
		cliente1.idade = 26;
		cliente1.objeto = "TV";
				
		System.out.println(cliente1.nome);
		System.out.println(cliente1.idade);
		System.out.println(cliente1.objeto);
		cliente1.escolher();
		cliente1.comprar();
		
		cliente2.nome = "Isabella";
		cliente2.idade = 23;
		cliente2.objeto = "Computador";
				
		System.out.println(cliente2.nome);
		System.out.println(cliente2.idade);
		System.out.println(cliente2.objeto);
		cliente2.escolher();
		cliente2.comprar();

	}

}
