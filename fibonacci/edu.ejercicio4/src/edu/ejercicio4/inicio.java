package edu.ejercicio4;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num1 =1;
		long num2 =0;
		long num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas posiciones de la serie Fibonacci quiere calcular?");
		int solicite = sc.nextInt();
		
		for(int a =0; a < solicite; a++)
		{
			System.out.println("El resultado es:");
			System.out.println(num1);
			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
			
			
			
		}
		
	}

}
