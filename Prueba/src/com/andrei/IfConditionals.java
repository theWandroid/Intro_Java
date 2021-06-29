package com.andrei;

import java.util.Scanner;

public class IfConditionals {
	
	public void ejercicios() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Que nota ha obtenido?"); 
		 int nota = sc.nextInt();
		 
		 if(nota == 5) { System.out.println("Aprobado por los pelos"); }
		 else if(nota >
		 5) { System.out.println("Aprobado!!!"); }
		 else {
		 System.out.println("Suspenso!!!"); }
		 
		 System.out.println("Introduce un numero");
		 int n = sc.nextInt();
		 
		  if(n % 2 == 0) { System.out.println(n+ "Es par"); }
		  else {
		 System.out.println(n + " Es impar"); }
		 
		  if(n == 0) { System.out.println(n+ "Es 0"); }
		  else if( n > 0) {
		 System.out.println(n + " Es positivo"); 
		 
		 
		 if(n > 100){ System.out.println(n +
		 " Es mayor que 100"); }
		 else { System.out.println(n + " Es menor que 100"); }
		 }else { System.out.println(n + " Es negativo"); }
		 
		 if(n % 5 == 0) { System.out.println(n+ "Es multiple de 5"); }else if(n % 10
		 == 0) { System.out.println(n + " Es multiple de 10"); }else {
		 System.out.println(n + " Es negativo"); }
		
	}

}
