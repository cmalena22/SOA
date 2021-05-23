package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC {
	
	private static String usuario = "root";
	private static String contrasena = "minoche53";
	private static String url = "jdbc:mysql://localhost:3306/bancopacifico";
	
	private static Connection connection;
	private static Statement st = null;
	
	private ResultSet resultSet = null;
	
	public ConnectionJDBC() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url,usuario, contrasena);
			
			if (connection != null) {
				
				st = connection.createStatement();
				System.out.println("Conexion creada");
				verCuentas(st);
				
			}
			else {
				System.out.println("Conexion Fallida");
			}
			
		} 
		catch ( SQLException e ) { e.printStackTrace();}
		catch ( ClassNotFoundException e ) { e.printStackTrace();}
		catch ( Exception e ) { e.printStackTrace();}

	}
	
	public void verCuentas(Statement st) throws SQLException {
		             
		
		resultSet = st.executeQuery("select * from cuenta as cu");
		while(resultSet.next())  
			System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3)+" "+resultSet.getDouble(4));  
		
	}
	
	

}
