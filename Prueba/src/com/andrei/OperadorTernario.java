package com.andrei;

public class OperadorTernario {

	
	public void ejercicios() {
		
		// operador ternario

				// Positivo o negativo

				int a = -5;

				String signo = (a >= 0) ? a + " es positivo" : a + " es negativo";

				System.out.println(signo);

				// Par o impar

				int i = 2;
				System.out.println(i + " es " + (i % 2 == 0 ? " es par" : " es impar"));
				System.out.println((i % 2 == 0) ? i + " es par" : i + " es impar");
		
	}
	
}
