package br.com.generation.laçosDeDecisao;

import java.util.Scanner;

public class ex4 {
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/

	public static void main(String[] args) {
		
		int n, p ;
		Scanner leia= new Scanner (System.in);
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		leia.close();
		
		if(n % 2 == 0) {
			System.out.println("O número " + n +  " é par");
			System.out.printf("A raiz quadrada de " + n + " é: %.2f", Math.sqrt(n));
		}
		else {
			p = n * n;
			System.out.println("O número " + n + " é impar ");
			System.out.println("A potência elevada ao quadrado de " + n + " é igual a: " + p);
		}
		

	}

}