package br.com.aeviles.cursojava.aula19.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[5];
		int []b=new int[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um valor na posição: "+(i+1));
			a[i]=scan.nextInt();
			
			b[i]=a[i]*2;
		}
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+ " ");
			
		}
		
		System.out.println();
		
		System.out.println("Vetor B: ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+ " ");
			
		}
		
		System.out.println();
		
	}

}
