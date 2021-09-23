import java.io.IOException;
import java.util.Scanner;

public class EjecutaPrograma {

	public static void main(String[] args) {
		int opcion;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("****MENU******");
			System.out.println("---------------");
			System.out.println("1.Calculadora");
			System.out.println("2.Bloc de notas");
			System.out.println("3.Salir");
			opcion=sc.nextInt();
			
			if(opcion==1) {
				try {
					Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
				}catch(IOException e) {
					System.out.println("Fichero no encontrado.");
				}
			}else if(opcion==2) {
				try {
					Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
				}catch(IOException e) {
					System.out.println("Fichero no encontrado.");
				}
			}else if(opcion==3) {
				System.out.println("¡Hasta pronto!");
			}
		}while(opcion!=3);
		
		
	}

}
