package com.andrei;

import java.util.Scanner;

public class Calculadora {

	 void introducir() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Esto es una calculadora");
		System.out.println("Introduce un primer n�mero");
		
		int a = sc.nextInt();
		
		System.out.println("Introduce un segundo n�mero");
		
		int b = sc.nextInt();
		
		System.out.println("Que operaci�n quieres realizar?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Diviidir");
		System.out.println("Introduce una de las cuatro opciones");
		
		int operacion = sc.nextInt();
		
		if(operacion == 1) {
			System.out.println("Has elegido sumar");
		}else if(operacion == 2) {
			System.out.println("Has elegido restar");
		}else if(operacion == 3) {
			System.out.println("Has elegido multiplicar");
		}else if(operacion == 4) {
			System.out.println("Has elegido dividir");
		}else {
			System.out.println("Operacion no contemplada");
		}
		
	}
	
	
void sumar() {
		
	}
	
	void restar() {
		
	}
	
void dividir() {
		
	}
	
	void multiplicar() {
		
	}
	
}
