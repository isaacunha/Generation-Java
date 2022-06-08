package br.com.generation.ExLacos;

import javax.swing.JOptionPane;

// Generation - turma 54
// Autora: Isabella Cunha
// Exercicio 3

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

public class Ex3 {

	public static void main(String[] args) {
		
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
		
		if(idade >= 10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "A pessoa se encontra na categoria Infantil");
		}
		else {
			if(idade > 14 && idade <= 17) {
				JOptionPane.showMessageDialog(null, "A pessoa se encontra na categoria Juvenil");
			}
			
			else {
				if (idade >17 && idade<= 25) {
				JOptionPane.showMessageDialog(null, "A pessoa se encontra na categoria Adulto");
				}
			
			
			else {
				JOptionPane.showMessageDialog(null, "A pessoa não se encontra em nenhuma das categorias");
				
				}
			}
			
		}

	}
}