package modelo;

public class CuerpoTransferencia {
	private String origenBanco;
	public String getOrigenBanco() {
		return origenBanco;
	}
	public void setOrigenBanco(String origenBanco) {
		this.origenBanco = origenBanco;
	}
	private String cuentaOrigen;
	private String cuentaDestino;
	private double monto;
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	

}
