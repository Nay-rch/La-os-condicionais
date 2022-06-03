package br.com.generation.laçosDeDecisao;

import java.util.Scanner;

public class ex3 {
	
	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/

	public static void main(String[] args) {
		
		String A = "infantil", 
				B = "juvenil", 
				C = "adulto";
		int idade = 0;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		leia.close();
		
		if(idade >= 10 && idade <= 14 ) {
			System.out.println("Sua categoria é: " + A);
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é: " + B);
		}
		else if(idade >=18 && idade <=25) {
			System.out.println("Sua categoria é: " + C);
		}
		else {
			System.out.println("Sem categoria");
		}
		
		

	}

}
