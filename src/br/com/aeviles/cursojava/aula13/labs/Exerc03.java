package br.com.aeviles.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero inteiro: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe outro numero inteiro: ");
		int numero2 = scan.nextInt();
		int soma= numero1+numero2;
		System.out.println("1O resultado da soma é:"+soma);
		
	}

}
