package br.com.generation.la�osDeDecisao;

import java.util.Scanner;

public class ex3 {
	
	/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
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
			System.out.println("Sua categoria �: " + A);
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria �: " + B);
		}
		else if(idade >=18 && idade <=25) {
			System.out.println("Sua categoria �: " + C);
		}
		else {
			System.out.println("Sem categoria");
		}
		
		

	}

}
