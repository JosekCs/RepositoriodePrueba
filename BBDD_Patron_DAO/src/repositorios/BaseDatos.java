package repositorios;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos 
{
	
	// Campos
	// ======
	public Connection conexion;
	private String cadenaConexion;
	
	// Constructores
	// =============
	public BaseDatos(String servidor, String usuario, String password, String baseDatos) 
	{
		this.cadenaConexion = "jdbc:mysql://" + servidor + "/" + baseDatos 
						   + "?user=" + usuario + "&password=" + password 
						   + "&autoReconnect=true";
	}

	
	// Métodos
	// =======
	public Connection conectar() throws Exception 
	{
		this.conexion = DriverManager.getConnection(this.cadenaConexion);
		
		System.out.println("Conectado!!");
		
		return conexion;
	}
	
	public void desconectar() throws Exception 
	{
		if( this.conexion!=null && this.conexion.isClosed()==false) 
		{
			this.conexion.close();
		}
	}
	
}
