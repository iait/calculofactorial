package com.eiv.factorial;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Factorial");
		
		CalculoFactorial factorial = new CalculoFactorialImpl();
		
		Scanner s = new Scanner(System.in);
		String sNum = s.nextLine();
		int num = Integer.valueOf(sNum);
		
		long resultado = factorial.calcular(num);
		System.out.println("El resultado del factorial de " + num + " es " + resultado);
		
		s.close();
	}
	
}
