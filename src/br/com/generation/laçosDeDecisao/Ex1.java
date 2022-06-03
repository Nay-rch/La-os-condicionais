package br.com.generation.laçosDeDecisao;

import java.util.Scanner;

public class Ex1 {
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
	
	public static void main(String[] args) {
	

		int N1 = 0,
			N2 = 0,
			N3 = 0,
			maior = 0;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o primeiro número: " );
		N1 = leia.nextInt();
		System.out.println("Digite o segundo número: " );
		N2 = leia.nextInt();
		System.out.println("Digite o terceiro número: " );
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
		System.out.println("O maior número é: " + maior);
		
	}

}
