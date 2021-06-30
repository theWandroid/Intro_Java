package com.andrei;

import java.util.Scanner;

public class Return {

	void calcCircunferencia() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el area de la circunferencia");
		int radio = sc.nextInt();
		float area = this.calAreaCircunferencia(radio);
		System.out.println("El area de la circunferencia con radio " +radio+ " es "+area+ ". ");
		float perimetro = this.calcPerimetroCircunferencia(radio);
		System.out.println("El perimetro de la circunferencia con radio " +radio+ " es "+perimetro+ ". ");
		
	}
	
	float calAreaCircunferencia(int r) {
		float area = (float)Math.PI * (float)Math.pow(r, 2);
		return area;
	}
	
	float calcPerimetroCircunferencia(int r) {
		float perimetro = (float)Math.PI * r * 2;
		return perimetro;
	}
	
}
