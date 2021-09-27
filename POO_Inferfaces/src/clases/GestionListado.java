package clases;

import java.util.ArrayList;

import Interfaces.iGestionListado;

public class GestionListado implements iGestionListado {
	
	//CAMPOS
	public ArrayList<Integer> listado;
	private int contNumeros;
	
	public GestionListado() {
		this.listado=new ArrayList<Integer>();
		this.contNumeros=0;
	}

	//METODO

	@Override
	public void nuevo(int numero) {
		
		if(this.listado.size()==18) {
			System.out.println("No introducido");
		}
		else if(this.listado.contains(numero)==true) {
			System.out.println("No introducido.Ya se encuentra en el listado");
		}else {
			this.listado.add(numero);
			this.listado.sort(null);

		}
	}

	@Override
	public void listar() {
		if(this.listado.size()==0) {
			System.out.println("Listado vacio.");
		}else {
			for(int i=0;i<this.listado.size();i++) {
					System.out.println(listado.get(i));
			}
		}
		
	}

	@Override
	public void eliminar(Integer numero) {
		if(listado.remove(numero)==false) {
			System.out.println("No se ha eliminado.El valor no está.");
		};
	}

	@Override
	public void eliminar() {	
		
		this.listado.clear();
	}

}
