package br.com.generation.ex2;

//heran�a --> de Pessoa
public class Cavalo extends Animal {
	

	private float velocidade;

	public void correr () {
		System.out.println(this.getNome() + " est� correndo a " + this.velocidade + " km/h");
	}
	
	//getter e setter
	
	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}


}
