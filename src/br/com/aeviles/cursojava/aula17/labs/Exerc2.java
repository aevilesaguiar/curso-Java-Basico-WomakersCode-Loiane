package br.com.aeviles.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		String nomeUser;
		String senha;

		do {

			System.out.println("Entre com o nome do usu�rio:");
			nomeUser = scan.next();

			System.out.println("Entre com a senha:");
			senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				// infoValidas = false;
				System.out.println("Senha igual a usu�rio, digite novamente.");
			} else {
				infoValidas = true;
				System.out.println("Senha e usu�rios v�lidos.");
			}

		} while (!infoValidas);

	}

}
