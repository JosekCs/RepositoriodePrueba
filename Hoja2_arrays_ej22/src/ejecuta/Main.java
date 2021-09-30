package ejecuta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 3, j, numero;
		int numeros[]=new int[n];
		boolean repetido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. " + n + " numeros sin repetir: ");
		for(int i=0; i<n; i++)
		{
			do
			{
				numero = sc.nextInt();
				
				repetido = false;
				j = 0;
				
				while(j<i && !repetido)
				{
					if(numeros[j]==numero)
					{
						repetido = true;
					}
					j++;
				}
				
				if(repetido)
				{
					System.out.println("El numero no puede repetirse");
				}
			}while(repetido);
			numeros[i]=numero;
		}
		sc.close();
		

		// mostramos los números
		System.out.println("Los numeros introducidos sin repetir son:");
		for(int i=0; i<n; i++)
		{
			System.out.println(numeros[i]);
		}
		
		System.out.println("FIN");
	}
}