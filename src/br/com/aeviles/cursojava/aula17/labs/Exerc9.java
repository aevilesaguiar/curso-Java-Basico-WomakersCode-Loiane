package br.com.aeviles.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo numero");
		int num2 = scan.nextInt();

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

}
