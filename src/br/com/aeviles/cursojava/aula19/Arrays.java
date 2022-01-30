package br.com.aeviles.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double [] temp = new double[5];
		
		temp[0]=20;
		temp[1]=35;
		temp[2]=32;
		temp[3]=30;
		temp[4]=20;
		
		System.out.println("O valor da temperatura dia 1:"+temp[0]);
		System.out.println("O valor da temperatura dia 2:"+temp[1]);
		System.out.println("O valor da temperatura dia 3:"+temp[2]);
		System.out.println("O valor da temperatura dia 4:"+temp[3]);
		System.out.println("O valor da temperatura dia 5:"+temp[4]);
		System.out.println("O tamanho da array: "+temp.length);
		//para saber todas as posições de um array , usamos o loop for
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(" Dia "+(i+1)+ " ="+ temp[i]);
		}
		
		System.out.println("For melhorado");
		for (double d : temp) {
			System.out.println(d);
		}

	}

	
}
