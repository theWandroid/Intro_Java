package com.andrei;
import java.util.Scanner;

public class Metodos {

	void initMetodos() {

	}

	void calcAreaRectangulo(int alto, int ancho) {
		int areaRectangulo = alto * 2 + ancho * 2;
		System.out.println(
				"El area del rectangulo con " + " altura " + alto + " y anchura " + ancho + " es " + areaRectangulo);
	}
	
	void calcAreaTriangulo(int alto, int base) {
		int areaTriangulo = alto * base/2;
		System.out.println("El area del triangulo con " + " altura " + alto + " y base " + base + " es " + areaTriangulo);
	}
	

	
}
