package br.com.generation.la�osDeDecisao;

import java.util.Scanner;

public class ex4 {
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/

	public static void main(String[] args) {
		
		int n, p ;
		Scanner leia= new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		n = leia.nextInt();
		
		leia.close();
		
		if(n % 2 == 0) {
			System.out.println("O n�mero " + n +  " � par");
			System.out.printf("A raiz quadrada de " + n + " �: %.2f", Math.sqrt(n));
		}
		else {
			p = n * n;
			System.out.println("O n�mero " + n + " � impar ");
			System.out.println("A pot�ncia elevada ao quadrado de " + n + " � igual a: " + p);
		}
		

	}

}