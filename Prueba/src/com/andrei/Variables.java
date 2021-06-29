package com.andrei;

public class Variables {
	public void variables() {
		int int_x = 32767;
		int int_y = 32768;
		int int_z = 32769;

		// El rango de un dato de tipo short llega hasta 32767

		short short_x = (short) int_x;
		short short_y = (short) int_y;
		short short_z = (short) int_z;

		System.out.println("1 - Conversión a short del int 32767: " + short_x);
		System.out.println("2 - Conversión a short del int 32768: " + short_y);
		System.out.println("2 - Conversión a short del int 32769: " + short_z);
	}

	public void ejercicios() {
		// Ejercicio de variables

		/*
		 * 1. Declarar una variable ‘i’ de tipo int, una variable ‘d’ de tipo double y
		 * una variable ‘c’ de tipo char. Asignar un valor a cada una. Mostrar por
		 * pantalla el valor de cada variable utilizando tres llamadas a
		 * System.out.println(). Tener en cuenta que:
		 * 
		 * Para dar valor a una variable de tipo double ponemos una “d” al final del
		 * valor.
		 * 
		 * Para dar valor a una variable de tipo char, esta debe ir entre comillas
		 * simples.
		 */
		int n2 = 5;
		double mi2 = 3.23d;
		char letra = 'a';

		System.out.println(n2);
		System.out.println(mi2);
		System.out.println(letra);

		// 2. Intercambiar el contenido de dos variables

		int a = 5;
		int b = 7;
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);

	}
}
