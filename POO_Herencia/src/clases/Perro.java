package clases;

public class Perro extends Mascota {

	private int numeroCrias;

	public Perro(String nombre, int edad, int numeroCrias) {
		super(nombre, edad);
		this.numeroCrias = numeroCrias;
	}

	public int getNumeroCrias() {
		return numeroCrias;
	}

	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}

	@Override
	public String toString() {
		return super.toString()+"Perro [numeroCrias=" + numeroCrias + "]";
	}

	

	
	
}
