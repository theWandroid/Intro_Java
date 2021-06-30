package com.andrei;

import java.util.Scanner;


public class StaticCalculadora {
	
	static float a = 0;
	static float b = 0;
	static float resultado = 0;
	static Scanner sc = new Scanner(System.in);
	
	static void introducir() {
		while(true) {
		System.out.println("Introduce el primer numero");
		a = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		b = sc.nextInt();
		elegirOperacion();}
	}
	
	static void elegirOperacion() {
		System.out.println("Que operación quieres realizar?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Diviidir");
		System.out.println("Introduce una de las cuatro opciones");
		
		int operacion = sc.nextInt();
		switch(operacion) {
		case 1:
			System.out.println("Has elegido sumar");
			resultado = Sumar();
			break;
		case 2: 
			System.out.println("Has elegido restar");
			resultado = Restar();
			break;
		case 3: 
			System.out.println("Has elegido multiplicar");
			resultado = Multiplicar();
			break;
		case 4:
			System.out.println("Has elegido dividir");
			resultado = Dividir();
			break;
		default:
			System.out.println("Operacion no contemplada");
			break;
		}
		if(operacion >= 0 && operacion <= 4) {
			System.out.println("El resutado es " +resultado);
		}
	}

	
	static float Sumar() {
	return a + b;
	}
	
	static float Restar() {
		return a - b;
	}
	
	static float Multiplicar() {
		return a * b;
	}
	
	static float Dividir() {
		return a / b;
	}

}
