package negocio;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;
import javax.swing.text.DefaultEditorKit.CutAction;

import modelo.CuerpoTransferencia;



@WebService(endpointInterface = "negocio.TransferenciaInt")
public class Transferencia implements TransferenciaInt{
	
	private static String usuario = "root";
	private static String contrasena = "minoche53";
	private static String url = "jdbc:mysql://localhost:3306/bancoaustro";
	
	private static Connection connection;
	private static Statement st = null;
	
	private PreparedStatement preparedStatement = null;
	
	private ResultSet resultSet = null;
	
	

	
	public Transferencia() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url,usuario, contrasena);
			
			if (connection != null) {
				
				st = connection.createStatement();
				System.out.println("Conexion creada");
				
			}
			else {
				System.out.println("Conexion Fallida");
			}
			
		} 
		catch ( SQLException e ) { e.printStackTrace();}
		catch ( ClassNotFoundException e ) { e.printStackTrace();}
		catch ( Exception e ) { e.printStackTrace();}
		
	}




	@Override
	public CuerpoTransferencia tranferirEnvio(String institucion, String cuentaOrigen, String cuentaDestino, double monto) throws SQLException {
		
		
		
		
		System.out.println("Ejecutando envio");
		// Recuperar cuenta
		
		double total=0.0;
		
		resultSet = st.executeQuery("select * from cuenta as cu where cu.num_cuenta_ced = "+cuentaOrigen);
		
		while(resultSet.next())
			total=resultSet.getDouble(4)-monto;
		

		preparedStatement = connection.prepareStatement("update Cuenta set saldo = ? where num_cuenta_ced = ?");
		preparedStatement.setDouble(1, total);
		preparedStatement.setString(2, cuentaOrigen);
		preparedStatement.executeUpdate();
		
		//Creacion de deposito
		System.out.println("Nuevo valor: "+total);
		preparedStatement = connection.prepareStatement("insert into transaccion values(default, ?,?,?,?,?)");
		preparedStatement.setDouble(1, monto);
		preparedStatement.setString(2, institucion);
		preparedStatement.setString(3, cuentaOrigen);
		preparedStatement.setString(4, "Envio");
		preparedStatement.setString(5, cuentaOrigen);
		preparedStatement.executeUpdate();
		
		CuerpoTransferencia transferencia = new CuerpoTransferencia();
		transferencia.setBancoOrigen(institucion);
		transferencia.setCuentaOrigen(cuentaOrigen);
		transferencia.setCuentaDestino(cuentaDestino);
		transferencia.setMonto(monto);
		
		
		return transferencia;
	}




	@Override
	public double transferirDeposito(String institucion, String cuentaOrigen, String cuentaDestino, double monto)
			throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Ejecutando recibo");
		
		// Recuperar cuenta
		
		double total=0.0;
		
		resultSet = st.executeQuery("select * from cuenta as cu where cu.num_cuenta_ced = "+cuentaDestino);
		
		while(resultSet.next())
			total=resultSet.getDouble(4)+monto;
		
		preparedStatement = connection.prepareStatement("update Cuenta set saldo = ? where num_cuenta_ced = ?");
		preparedStatement.setDouble(1, total);
		preparedStatement.setString(2, cuentaDestino);
		preparedStatement.executeUpdate();				
		
		
		preparedStatement = connection.prepareStatement("insert into transaccion values(default, ?,?,?,?,?)");
		preparedStatement.setDouble(1, monto);
		preparedStatement.setString(2, institucion);
		preparedStatement.setString(3, cuentaOrigen);
		preparedStatement.setString(4, "Deposito");
		preparedStatement.setString(5, cuentaDestino);
		preparedStatement.executeUpdate();
		

//		
		
		// TODO Auto-generated method stub
		return monto;
	}
	



	

}
