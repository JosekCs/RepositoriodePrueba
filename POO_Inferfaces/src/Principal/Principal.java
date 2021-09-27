package Principal;

import java.util.Scanner;

import clases.GestionListado;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//
		GestionListado gestion;
		int opcion = 0;
		int numero;
		String menu="********* MENU *********\n"+"1.-Introducir numeros enteros\n"+
		"2.-Listar numeros.\n"+"3.-Eliminar numeros.\n"+"4.-Eliminar todos los numeros\n"
		+"5.-Salir\n";
		
		gestion = new GestionListado();
		
		do {
			
			System.out.println(menu);
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduzca un numero:");
				numero=sc.nextInt();
				gestion.nuevo(numero);
				break;
			case 2:
				gestion.listar();
				break;
			case 3:
				System.out.println("Introduce un numero");
				numero=sc.nextInt();
				gestion.eliminar(numero);
				break;
			case 4:
				
				gestion.eliminar();
				break;
			case 5:
				System.out.println("Hasta pronto!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}while(opcion!=5);
		
		
	}

}
