
public class Tablas {

	public static void main(String[] args) {
		
	int resultado;
	String fila;
	
	
	for(int numero=1;numero<=9;numero++) {
		
		
		for(int j=1;j<=10;j++) {
			resultado = numero*j;
			fila = numero + "  x   "+ j+ "   =   "+ resultado;
			System.out.println(fila);
		}
		
		System.out.println("******************");
	}
	}

}
