package br.com.generation.ExLacos;
//Generation - turma 54
//Autora: Isabella Cunha
//Exercicio 1

import javax.swing.JOptionPane;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class Ex1 {
public static void main(String[] args) {
		
		int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite  o 1º numero:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite  o 2º numero:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite  o 3º numero:"));

	
			if (a > b && a > c){
			JOptionPane.showMessageDialog(null, "O numero maior é: " + a);
			}
			else {
				if(b> a && b>c) {
					JOptionPane.showMessageDialog(null, "O numero maior é: " + b);
				}
				else {
					JOptionPane.showMessageDialog(null, "O numero maior é: " + c);
				}
			}
}
}

