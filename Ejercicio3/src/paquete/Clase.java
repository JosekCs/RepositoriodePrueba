package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Clase {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String nombre;
	int anoNacimiento;
	int suma=0; //acumulador
	float media;
	int edad;
	int anoAhora = Calendar.getInstance().get(Calendar.YEAR);
	int menor=Integer.MAX_VALUE;
	boolean continuar = true;
	String nombreMenor = null;
	int contEdad=0;
	String mensaje;
	
	do {
		System.out.println("Introduzca nombre:");
		nombre=sc.nextLine();
		if(nombre.equals("fin")) {
			
			continuar=false;
			
		}else {
			
			System.out.println("Introduzca un año de nacimiento:");
			anoNacimiento=Integer.valueOf(sc.nextLine());
			edad = anoAhora - anoNacimiento;
			contEdad++;
			suma+=edad;
			
			if(edad<menor) {
				menor = edad;
				nombreMenor = nombre;
			}
		}
		
		
	}
	while(continuar==true);
	sc.close();
	
	if(contEdad>0) {
		media = (float)suma/(float)contEdad;
		
		mensaje="El mas joven se llama "+nombreMenor+" y la media de la edad es "+ media;
		System.out.println(mensaje);
		System.out.println("Fin del programa");
		System.out.println("Fin del programa");

	}
	

	}
}
