package com.andrei;

public class MetodosCadenas {

	
	void getSubString(String name, int init, int end) {
		System.out.println(name.substring(init, end));
	}
	
	//busca una letra dentro de la palabra que le pasamos por parametro
	void getIndexOf(String name, char letra) {
		System.out.println(name.indexOf(letra));
	}
	
	void nameToUpperCase(String name) {
		System.out.println(name.toUpperCase());
	}
	
	void nameToLowerCase(String name) {
		System.out.println(name.toLowerCase());
	}
	
	void getLength(String name) {
		System.out.println(name.length());
	}
}
