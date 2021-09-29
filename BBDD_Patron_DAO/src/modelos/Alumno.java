package modelos;

public class Alumno 
{
	
	// Campos
	public int matricula;
	public String apellido;
	public String nombre;
	
	// Constructores
	
	public Alumno(int matricula, String apellido, String nombre) {
		this.matricula = matricula;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	
	public Alumno(int matricula) {
		this.matricula = matricula;
	}
	
	public Alumno() {
	}

	
	// Métodos
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", apellido=" + apellido + ", nombre=" + nombre + "]";
	}
}
