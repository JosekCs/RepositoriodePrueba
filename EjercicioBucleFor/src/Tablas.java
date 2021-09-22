
public class Tablas {

	public static void main(String[] args) {
		
	int resultado;
	String fila;
	int suma;
	
	
	for(int numero=1;numero<=9;numero++) {
		System.out.println("\nTabla del "+numero+":");
		suma=0;
		
		for(int j=1;j<=10;j++) {
			resultado = numero*j;
			suma = suma+resultado;
			fila = numero + "  x   "+ j+ "   =   "+ resultado;
			System.out.println(fila);
		}
		
		System.out.println("********"+" La suma vale: "+suma+"**********");

	}
	}

}
