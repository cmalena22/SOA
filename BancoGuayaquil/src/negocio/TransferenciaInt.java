package negocio;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import modelo.CuerpoTransferencia;

@WebService	
public interface TransferenciaInt {
	@WebMethod
	public CuerpoTransferencia tranferirEnvio(String institucion, String cuentaOrigen, String cuentaDestino, double monto) throws SQLException;
	
	@WebMethod
	public double transferirDeposito(String institucion, String cuentaOrigen, String cuentaDestino, double monto) throws SQLException;

}
