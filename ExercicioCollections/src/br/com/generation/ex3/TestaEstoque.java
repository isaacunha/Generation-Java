package br.com.generation.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) throws InterruptedException{
		Scanner in = new Scanner(System.in);
		
		ArrayList<Estoque> estoqueProdutos = new ArrayList<>();
		System.out.println("Bem vinde ao estoque da IraLI");
		
		int option = 0;
		do {
		System.out.println(" Qual a opção desejada?");
		System.out.println("1 - Adicionar Produto \n2 - Remover Produto \n3 - Atualizar Produto \n4 - Verificar Estoque ");
		int opcao = in.nextInt();
		
		switch(opcao) {
		
			case 1:
				System.out.println("Vamos adicionar um Produto? ");
				int i = 1;
				do {
					System.out.printf("\nQual o produto?: ");
					in.nextLine();
					String produto = in.nextLine();
					System.out.printf("Qual o preço do " + produto);
					double preco = in.nextDouble();
					System.out.printf("Qual a quantidade do "+ produto);
					int quantidade = in.nextInt();
					System.out.println("Deseja adiocionar mais algum produto? \n1 - Sim ou 2 - Não");
					estoqueProdutos.add(new Estoque(produto, preco, quantidade));
					i = in.nextInt();
					
				}while(i == 1);
				break;
			
			case 2:
				System.out.println("Vamos remover um produto da lista?");
				System.out.println("DIGITE:\n1 - Para remover todos os produtos \n2 - Para acessar a lista de produtos");
				i = in.nextInt();
				if( i == 1) {
					for(int c =0; c <= estoqueProdutos.size(); c++) {
						System.out.println(estoqueProdutos.get(c));
						System.out.println("REMOVIDO COM SUCESSO");
						estoqueProdutos.remove(c);
						Thread.sleep(500);
					}
				}else if ( i == 2) {
					System.out.println("Lista de produtos");
					for(int x=0; x < estoqueProdutos.size(); x++) {
						System.out.println(estoqueProdutos.get(x).getProduto() + " codigo: " + x);
					}
					System.out.println("Qual produto quer deletar? Insira aqui o codigo:");
					int del = in.nextInt();
					estoqueProdutos.remove(del);
					Thread.sleep(500);
					System.out.println("Remoção feita com sucesso!");
				}else {
					System.out.println("Opção digitada é invalida");
				}
					break;
			
			
			case 3:
				System.out.println("Atualizar um Produto=");
				System.out.println("\nEsta é a lista: ");
		
					for(int x=0; x < estoqueProdutos.size(); x++) {
						System.out.println(estoqueProdutos.get(x).getProduto() + " Codigo: " + x);
					}
					System.out.println("\nQual o codigo o produto que quer atulizar?");
					int id = in.nextInt();

					System.out.printf("Novo produto: ");
					in.nextLine();
					String produto = in.nextLine();
					System.out.printf("Novo preço do produto: ");
					double preco = in.nextDouble();
					in.nextLine();
					System.out.printf("Nova quantidade do produto: ");
					int quantidade = in.nextInt();
					in.nextLine();
					estoqueProdutos.set(id, new Estoque(produto, preco, quantidade));
					Thread.sleep(500);
					System.out.println("\nSucesso na atualização");
					break;
		
			case 4:
				System.out.println("Estoque:");
				for(Estoque j: estoqueProdutos) {
					System.out.println(j);
					Thread.sleep(600);
				}
				break;
		}
		System.out.println("\nDIGITE: 0 - Para finalizar ou 1 - Para voltar ao inicio");
		option = in.nextInt();
		in.nextLine();
		
		}while(option != 0);
		
		in.close();

	}	

	}

