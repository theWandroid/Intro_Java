package com.andrei;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*	
		 * 
		 * int n = 8;
		
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo!!!");
		System.out.println();
		
		int int_x = 32767;
		int int_y = 32768;
		int int_z = 32769;
	
		// El rango de un dato de tipo short llega hasta 32767

		short short_x = (short) int_x;
		short short_y = (short) int_y;
		short short_z = (short) int_z;

		System.out.println("1 - Conversi�n a short del int 32767: " + short_x);
		System.out.println("2 - Conversi�n a short del int 32768: " + short_y);
		System.out.println("2 - Conversi�n a short del int 32769: " + short_z);

		byte byte_x = (byte) int_x;
		byte byte_y = (byte) int_y;
		byte byte_z = (byte) int_z;

		System.out.println("3 - Conversi�n a byte del int 32767: " + byte_x);
		System.out.println("4 - Conversi�n a byte del int 32768: " + byte_y);
		System.out.println("5 - Conversi�n a byte del int 100: " + byte_z);
		*/
		//Ejercicio de variables
		
		/*
		 * 
		 *
		 * 
		 * 1. Declarar una variable �i� de tipo int, una variable �d� de tipo double y una variable �c� de tipo char. Asignar un valor a cada una. Mostrar por pantalla el valor de cada variable utilizando tres llamadas a System.out.println(). Tener en cuenta que:

			Para dar valor a una variable de tipo double ponemos una �d� al final del valor.

			Para dar valor a una variable de tipo char, esta debe ir entre comillas simples.
			
			
		int n2 = 5;
		double mi2 = 3.23d;
		char letra = 'a';
		
		System.out.println(n2);
		System.out.println(mi2);
		System.out.println(letra);
		
		//2. Intercambiar el contenido de dos variables
		
		int a = 5;
		int b = 7;
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);

		
	String saludo = "Buenos dias ";
	String nombre = "Juan";
	
	System.out.println(saludo + nombre);
	
	
	1. Escribir un programa que calcule el n�mero de segundos que existen en un d�a. Como todo el mundo sabe, un d�a tiene 86400 segundos.
	
	
			*/
		
		int day = 1;
		int dayHours = 24;
		int minutesHour = 60;
		int secondsMinute = 60;
		int seconds = day * dayHours * minutesHour * secondsMinute;
		System.out.println(seconds);
		
		/*
		 2. Hacer un conversor de euros a d�lares. El usuario introduce una cantidad de euros y obtiene su valor en d�lares. Supondremos que un euro son dos d�lares
		 
		 Scanner sc = new Scanner(System.in);
		 
		 // entrada de una cadena
        String name = sc.nextLine();

        // entrada de un car�cter
        char gender = sc.next().charAt(0);

        // Entrada de datos num�ricos
        // byte, short y float
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos euros quieres introducir?");
		 int euros = sc.nextInt();
		 
		 
		 System.out.println(euros +" son "+ euros*2 + " dolares.");
		   */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos grados centigrados quieres introducir?");
		 int centigrados = sc.nextInt();
		 float farenheirt = (centigrados*9/5)+32;
			 
		 System.out.println(centigrados +" grados centigrados son "+ farenheirt  + " Farenheirt.");
		 
		
	}

}
