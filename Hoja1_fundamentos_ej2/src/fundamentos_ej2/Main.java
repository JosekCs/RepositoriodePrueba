package fundamentos_ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int contNumerosValidos = 0;
		int contNumerosNoValidos = 0, maxNumero=19, numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. 11 numeros entre 20 y 40");
		do 
		{
			numero = sc.nextInt();
			if(numero>10 && numero <41)
			{
				contNumerosValidos++;
				if(numero>maxNumero)
				{
					maxNumero = numero;
				}
			}
			else
			{
				contNumerosNoValidos++;
				System.out.println("Incorrecto, debe estar entre 20 y 40");
			}
		}while(contNumerosValidos<3);
		
		System.out.println("El maximo es " + maxNumero);
		System.out.println("Se han introducido " + contNumerosNoValidos + " numeros no válidos");

		sc.close();
	}
}