package br.com.aeviles.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra:");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println("Nao e uma letra valida");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal");
				break;
			default:
				System.out.println("consoante");
			}
		}

	}
}
