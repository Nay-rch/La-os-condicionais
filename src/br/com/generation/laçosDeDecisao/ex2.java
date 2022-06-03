package br.com.generation.laçosDeDecisao;

import java.util.Scanner;

public class ex2 {

	/*Faça um programa que entre com três números e coloque em ordem crescente.*/
	public static void main(String[] args) {
		
		int N1, N2, N3;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o primeiro número:");
		N1 = leia.nextInt();
		System.out.println("Digite o segundo número:");
		N2 = leia.nextInt();
		System.out.println("Digite o terceiro número:");
		N3 = leia.nextInt();
		
		leia.close();
		
		if(N1 < N2 && N1 < N3 ) {
			if(N2 < N3) {
				System.out.println(N1 + "->" + N2 + "->" + N3);
			}else if(N3 < N2) {
				System.out.println(N1 + "->" + N3 + "->" + N2);
			}
			
		}
		if(N2 < N1 && N2 < N3) {
			if(N3 < N1) {
				System.out.println(N2 + "->" + N3 + "->" + N1 );
			}else if(N1 < N3) {
				System.out.println(N2 + "->" + N1 + "->" + N3 );
			}
		}
		if(N3 < N1 && N3 < N2) {
			if(N1 < N2) {
				System.out.println(N3 + "->" + N1 + "->" + N2);
			}else if(N2 < N1) {
				System.out.println(N3 + "->" + N2 + "->" + N1);
			}
		}
		
	}

}