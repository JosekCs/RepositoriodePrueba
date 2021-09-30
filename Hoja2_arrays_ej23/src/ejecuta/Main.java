package ejecuta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 12, j;
		int numeros[]=new int[n];
		boolean repetido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. " + n + " numeros: ");
		for(int i=0; i<n;  i++)
		{
			numeros[i] = sc.nextInt();  
		}
		
		System.out.println("Los numeros omitiendo las repeticiones son:");
		for(int i=0; i<n;  i++)
		{
			j=0;
			repetido = false;
			while(!repetido && j<i)
			{
				if(numeros[j]==numeros[i])
				{
					repetido = true;
				}
				else {
					j++;
				}
			}
			if(!repetido)
			{
				System.out.println(numeros[i]);
			}
		}
		sc.close();
		
	}
}
