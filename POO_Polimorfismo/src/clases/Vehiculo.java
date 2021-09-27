package clases;

public class Vehiculo {
	
	//campos 
	public String tipo;
	public int peso;
	public String color;
	
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}

	public Vehiculo() {

	}

	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	
	

}
