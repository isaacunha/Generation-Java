package br.com.generation.ExLacos;

import javax.swing.JOptionPane;

//Generation - turma 54
//Autora: Isabella Cunha
//Exercicio 4

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

public class Ex4 {

	public static void main(String[] args) {
		
		double numero, raiz, quadrado;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
		
		if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			JOptionPane.showMessageDialog(null, "O numero que voce digitou � par e a raiz deste �: "+ raiz);
		}
		else {
			quadrado = numero*numero;
			JOptionPane.showMessageDialog(null, "O numero que voce digitou � impar e o quadrado deste �: "+ quadrado);
		
		
		}

	}

	}

