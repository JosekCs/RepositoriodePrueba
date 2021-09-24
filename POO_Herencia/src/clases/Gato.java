package clases;

public class Gato extends Mascota {
	
	private int numerodeVidas;

	public Gato(String nombre, int edad, int numerodeVidas) {
		super(nombre, edad);
		this.numerodeVidas = numerodeVidas;
	}

	public int getNumerodeVidas() {
		return numerodeVidas;
	}

	public void setNumerodeVidas(int numerodeVidas) {
		this.numerodeVidas = numerodeVidas;
	}

	@Override
	public String toString() {
		return super.toString()+"Gato [numerodeVidas=" + numerodeVidas + "]";
	}

	
	
	

}
