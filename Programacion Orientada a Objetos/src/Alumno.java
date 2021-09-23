import java.util.Scanner;

public class Alumno {
	
	public String nombre;
	public String apellido1;
	public String apellido2;

	public Alumno() {
		
	}

	public Alumno(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}
	
	public int sumarNotas(int nota1,int nota2) {
		int resultado;
		
		
		resultado = nota1+nota2;
		return resultado;
	}
	
	public void mostrar() {
		
		String mensaje;
		
		mensaje="El nombre del alumno es "+this.nombre+"\n"+"El primer apellido es"+this.apellido1+"\n"+"El segundo apellido es:"+this.apellido2;
		System.out.println(mensaje);
		
	}
	
	

}
