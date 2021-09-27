package clases;


public class Coche extends Vehiculo {
	
	//campos
	public boolean camara;
	private ECombustible combustible;
	
	public Coche(boolean camara, ECombustible combustible,String tipo, int peso, String color) {
		super(tipo, peso, color);
		this.camara = camara;
		this.combustible = combustible;
	}

	public Coche() {
	}

	@Override
	public String toString() {
		return super.toString()+"Coche [camara=" + ((camara==true)?"Si":"No") + ", combustible=" + combustible + "]";
	}

	
	
	

}
