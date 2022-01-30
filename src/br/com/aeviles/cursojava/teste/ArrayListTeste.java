package br.com.aeviles.cursojava.teste;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTeste {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String >aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        

        System.out.println(aulas);
        
        
        //removendo elementos
        System.out.println("\nRemovendo elementos");
        
        aulas.remove(0);
        System.out.println(aulas);
        
        System.out.println("\nPercorrendo uma lista");
        //percorrendo uma lista
        
        for (String aula : aulas) {
			System.out.println("Aula:"+aula);
		}
        System.out.println("\nAcessando elementos");

        String primeiraAula = aulas.get(0);
        
        System.out.println("A primeira aula é: "+primeiraAula);
        //pode ser usado o mesmo método para percorrer a lista
        
        for (int i = 0; i < args.length; i++) {
			System.out.println("Aula: "+aulas.get(i));
		}
        
        System.out.println("Mais uma forma de percorrer elementos, agora com Java 8");
        System.out.println("Percorrendo com forEach()");
        aulas.forEach(aula->{
        	System.out.println("Percorrendo: ");
        	System.out.println("Aula "+aula);
        });
        
        System.out.println("\nOrdenando a Lista");
        
        Collections.sort(aulas);
        System.out.println("Depois de ordenada");
        System.out.println(aulas);
        
        
        
        
        
	}

}
