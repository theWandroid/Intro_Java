package com.andrei;

import java.util.Scanner;

public class Conversion {

	
	public void ejercicios() {
		/*
		 1. Escribir un programa que calcule el n�mero de segundos que existen en un
		 * d�a. Como todo el mundo sabe, un d�a tiene 86400 segundos.
		 */

		int day = 1;
		int dayHours = 24;
		int minutesHour = 60;
		int secondsMinute = 60;
		int seconds = day * dayHours * minutesHour * secondsMinute;
		System.out.println(seconds);

		/*
		 * 2. Hacer un conversor de euros a d�lares. El usuario introduce una cantidad
		 * de euros y obtiene su valor en d�lares. Supondremos que un euro son dos
		 * d�lares
		 */
		  Scanner sc = new Scanner(System.in);
		 
		 // entrada de una cadena String name = sc.nextLine();
		 
		  // entrada de un car�cter char gender = sc.next().charAt(0);
		 
		 // Entrada de datos num�ricos // byte, short y float int age = sc.nextInt();
		 long mobileNo = sc.nextLong(); double average = sc.nextDouble();
		 
		 
		 System.out.println("Cuantos euros quieres introducir?"); int euros =
		 sc.nextInt();
		 
		 
		 System.out.println(euros +" son "+ euros*2 + " dolares.");
		 
		 System.out.println("Cuantos grados centigrados quieres introducir?"); int
		 centigrados = sc.nextInt(); float farenheirt = (centigrados*9/5)+32;
		 
		  System.out.println(centigrados +" grados centigrados son "+ farenheirt +
		 " Farenheirt.");
		 
	}
	
}
