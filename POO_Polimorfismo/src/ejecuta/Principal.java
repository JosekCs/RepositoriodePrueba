package ejecuta;

import clases.Coche;
import clases.ECombustible;
import clases.Tren;
import clases.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		Vehiculo[] vehiculos = new Vehiculo[3];
		Vehiculo veh;
		Coche miCoche = new Coche(true,ECombustible.gasolina,"Coche",1000,"Verde");
		Tren miTren = new Tren("Tren",14999,"Azul",10,true);
		
		
		vehiculos[0]=miCoche;
		vehiculos[1]=miTren;
		
		for(int i=0;i<2;i++) {
			veh=vehiculos[i];
			if(veh instanceof Tren) {
				miTren = (Tren) veh;
				System.out.println(miTren.toString());

			}else if(veh instanceof Coche) {
				miCoche=(Coche) veh;
				System.out.println(miCoche.toString());

			}
		}

	}

}
