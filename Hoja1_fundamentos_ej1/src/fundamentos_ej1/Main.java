package fundamentos_ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner sc;
		
		sc = new Scanner(System.in);

		System.out.println("Intro. A: ");
		a = sc.nextInt();
		
		System.out.println("Intro. B: ");
		b = sc.nextInt();
		
		if(a%b==0)
		{
			System.out.println(b + " es " + " divisor de " + a);
		}
		else
		{
			System.out.println(b + " no es " + " divisor de " + a);
		}
		
		sc.close();
	}
	
}