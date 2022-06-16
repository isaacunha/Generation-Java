package br.com.generation.ex3;

public class Estoque {
	private String produto;
	private double preco;
	private int quantidade;
	
	public Estoque(String produto, double preco, int quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.produto = produto;

	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}


	@Override
	public String toString() {
		return "Produto: " + produto + "\nQuantidade: " + quantidade + "\nPreco: " + preco ;
	}
	
}
