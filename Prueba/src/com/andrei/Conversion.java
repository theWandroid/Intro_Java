package com.andrei;

import java.util.Scanner;

public class Conversion {

	
	public void ejercicios() {
		/*
		 1. Escribir un programa que calcule el número de segundos que existen en un
		 * día. Como todo el mundo sabe, un día tiene 86400 segundos.
		 */

		int day = 1;
		int dayHours = 24;
		int minutesHour = 60;
		int secondsMinute = 60;
		int seconds = day * dayHours * minutesHour * secondsMinute;
		System.out.println(seconds);

		/*
		 * 2. Hacer un conversor de euros a dólares. El usuario introduce una cantidad
		 * de euros y obtiene su valor en dólares. Supondremos que un euro son dos
		 * dólares
		 */
		  Scanner sc = new Scanner(System.in);
		 
		 // entrada de una cadena String name = sc.nextLine();
		 
		  // entrada de un carácter char gender = sc.next().charAt(0);
		 
		 // Entrada de datos numéricos // byte, short y float int age = sc.nextInt();
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
