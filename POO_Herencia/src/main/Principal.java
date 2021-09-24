package main;

import clases.Gato;
import clases.Mascota;
import clases.Perro;

public class Principal {

	public static void main(String[] args) {
		
		Perro perroUno = new Perro("Doggy",8,2);
		Gato gatoUno = new Gato("Kath",10,7);
		
		System.out.println(perroUno.toString());
		System.out.println(gatoUno.toString());

	}	

}
