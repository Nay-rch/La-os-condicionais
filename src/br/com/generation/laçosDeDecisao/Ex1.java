package br.com.generation.la�osDeDecisao;

import java.util.Scanner;

public class Ex1 {
	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	
	public static void main(String[] args) {
	

		int N1 = 0,
			N2 = 0,
			N3 = 0,
			maior = 0;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o primeiro n�mero: " );
		N1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: " );
		N2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: " );
		N3 = leia.nextInt();
		
		leia.close();
		
		if(N1 > N2 && N1 > N3) {
			maior = N1;
		}
		if( N2 > N1 && N2 > N3) {
			maior = N2;
		}
		if(N3 > N2 && N3 > N1) {
			maior = N3;
		}
		System.out.println("O maior n�mero �: " + maior);
		
	}

}
