package br.com.generation.ex2;

public class Preguica extends Animal {

	public void subirArvore(float metros) throws InterruptedException {
		for (int i = 0; i <= metros; i += 5) {
			System.out.println("Subindo em " + i + "metros");
			Thread.sleep(1000);
		}

	}
}
