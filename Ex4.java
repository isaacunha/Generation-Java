package br.com.generation.ExLacos;

import javax.swing.JOptionPane;

//Generation - turma 54
//Autora: Isabella Cunha
//Exercicio 4

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class Ex4 {

	public static void main(String[] args) {
		
		double numero, raiz, quadrado;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
		
		if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			JOptionPane.showMessageDialog(null, "O numero que voce digitou é par e a raiz deste é: "+ raiz);
		}
		else {
			quadrado = numero*numero;
			JOptionPane.showMessageDialog(null, "O numero que voce digitou é impar e o quadrado deste é: "+ quadrado);
		
		
		}

	}

	}

