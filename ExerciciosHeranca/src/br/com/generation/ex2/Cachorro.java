package br.com.generation.ex2;

public class Cachorro extends Animal {

	private float velocidade;

	public void correr () {
		System.out.println(this.getNome() + " está correndo" + this.velocidade + " km/h");
	}
	
	//getter e setter
	
	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float f) {
		this.velocidade = f;
	}
}
