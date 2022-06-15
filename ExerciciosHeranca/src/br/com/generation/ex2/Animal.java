package br.com.generation.ex2;

public class Animal {
	
	private String Nome;
	private int idade;
	private String som;
	
	//método
		public void som(String som) {
			System.out.println(this.Nome + ": " + som);
		}
	
		//getter e setter
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getsom() {
		return som;
	}
	public void setsom(String endereco) {
		this.som = endereco;
	}

}
