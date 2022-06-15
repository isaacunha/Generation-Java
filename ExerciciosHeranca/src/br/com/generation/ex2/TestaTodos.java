package br.com.generation.ex2;


public class TestaTodos {
	
public static void main(String[] args) throws InterruptedException {

	Cachorro c1 = new Cachorro();
	Cavalo ca1 = new Cavalo();
	Preguica zzz = new Preguica();

	c1.setNome("Belinha");
	c1.som("late");
	c1.setVelocidade(5.0f);
	
	c1.correr();

	System.out.println("================");

	ca1.setNome("Mimosa");
	ca1.som("relincha");
	ca1.setVelocidade(15.0f);
	
	ca1.correr();

	System.out.println("===============");

	zzz.setNome("Dona pregui");
	zzz.som("girtinho");
	zzz.subirArvore(10.0f);

}
}

