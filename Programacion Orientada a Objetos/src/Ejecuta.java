import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nota1,nota2;

		Alumno alumno1 = new Alumno("Jose","Duran","Sanchez");
		Alumno alumno2 = new Alumno();
		
		alumno2.nombre="Matias";
		alumno2.apellido1="Duran";
		alumno2.apellido2="Sanchez";
		System.out.println("DIme la primera nota");
		nota1 = sc.nextInt();
		System.out.println("DIme la segunda nota");
		nota2 = sc.nextInt();
		int suma = alumno1.sumarNotas(nota1,nota2);
		alumno1.mostrar();
		System.out.println(suma);
		System.out.println(alumno2.toString());


		
	}
	
	
	
}


