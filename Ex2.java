package br.com.generation.ExLacos;

import javax.swing.JOptionPane;

//Generation - turma 54
//Autora: Isabella Cunha
//Exercicio 2

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

public class Ex2 {
	public static void main(String[] args) {
		
		int a,b,c, n;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite  o 1� numero:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite  o 2� numero:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite  o 3� numero:"));

	
			if (a > b && a > c){
			JOptionPane.showMessageDialog(null, "O numero maior �: " + a);
			}
			else {
				if(b> a && b>c) {
					JOptionPane.showMessageDialog(null, "O numero maior �: " + b);
				}
				else {
					JOptionPane.showMessageDialog(null, "O numero maior �: " + c);
				}
			}
			
}

	
	
	
	

}
