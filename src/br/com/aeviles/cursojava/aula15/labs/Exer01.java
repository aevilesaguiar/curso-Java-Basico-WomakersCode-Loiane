package br.com.aeviles.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo numero");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("O numero maior: " + num1);
		} else {
			System.out.println("O numero maior: " + num2);
		}
	}
}
