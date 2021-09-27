package clases;

public class Tren extends Vehiculo {
	
	//Campos
	private int vagones;
	private boolean largoRecorrido;
	
	public Tren(String tipo, int peso, String color, int vagones, boolean largoRecorrido) {
		super(tipo, peso, color);
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}

	public Tren() {
	}

	@Override
	public String toString() {
		return super.toString()+"Tren [vagones=" + vagones + ", largoRecorrido=" + ((largoRecorrido==true)?"Sí":"No") + "]";
	}
	
	

}
