package com.andrei;

public class Random {
	
	void initRandom() {
		
		int a = 0;
		for(int i = 0; i <= 10; i++) {
			//vamos a tener valores aleatorios entre 0 y 6 sin incluir el 6
			a = (int)Math.floor(Math.random() * 6);
			System.out.println(a);
		}
		
		
		
		System.out.println("El n?mero aleatorio es "+ a);
	}
	
	 int newRandom(int max) {
		int num = 0;
		num = (int)Math.floor(Math.random()*max+1);
		return num;
		
	}
}
