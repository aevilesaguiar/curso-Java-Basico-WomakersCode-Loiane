package br.com.aeviles.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com um numero:");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
				System.out.println("o numero maior mudou: " + maior);
			}
		}

		System.out.println("O maior n�mero digitado foi: " + maior);

	}

}
