package com.andrei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	

		Variables initVariables = new Variables();
		For initFor = new For();
		//initVariables.variables();
		//initVariables.ejercicios();
		
		//initFor.ejercicioPares100();
		
		Random initRandom = new Random();
		//initRandom.initRandom();
		
		
		for(int i=0; i<=10; i++) {
			int a = initRandom.newRandom(10);
		System.out.println(a);
		}
		
		
		MetodosCadenas metCad = new MetodosCadenas();
		
		//metCad.su
/*
		Metodos metodos = new Metodos();
		metodos.calcAreaRectangulo(12, 20);
		metodos.calcAreaTriangulo(15, 7);
		Return returnEjercicios = new Return();
		returnEjercicios.calcCircunferencia();
		*/
		//StaticCalculadora.introducir();
		
		Constructores estudiante = new Constructores("Tatiana", 27);
		System.out.println(estudiante.nombre + ", " +estudiante.edad);
		
		Constructores estudiante2 = new Constructores("Andrei", 28);
		System.out.println(estudiante2.nombre + ", " +estudiante2.edad);
		
	}

}
