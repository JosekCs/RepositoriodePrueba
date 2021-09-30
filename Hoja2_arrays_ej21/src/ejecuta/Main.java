package ejecuta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 11;
		int numeros[]=new int[n];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. " + n + " numeros: ");
		for(int i=0; i<n;  i++)
		{
			numeros[i] = sc.nextInt();  
		}
		sc.close();
		
		System.out.println("Los numeros invertidos son:");
		for(int i=n-1; i>-1; i--)
		{
			System.out.print(numeros[i] +" ");
		}
		System.out.println("FIN");
	}
}

