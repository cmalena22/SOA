package modelo;


public class Transaccion {
	
	private int tra_id;
	private String tipo;
	private String origen_banco;
	private String origen_cuenta;
	private double monto;
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
    private Cuenta cuenta;
	
	public int getTra_id() {
		return tra_id;
	}
	public void setTra_id(int tra_id) {
		this.tra_id = tra_id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getOrigen_banco() {
		return origen_banco;
	}
	public void setOrigen_banco(String origen_banco) {
		this.origen_banco = origen_banco;
	}
	public String getOrigen_cuenta() {
		return origen_cuenta;
	}
	public void setOrigen_cuenta(String origen_cuenta) {
		this.origen_cuenta = origen_cuenta;
	}
	@Override
	public String toString() {
		return "Transaccion [tra_id=" + tra_id + ", tipo=" + tipo + ", origen_banco=" + origen_banco
				+ ", origen_cuenta=" + origen_cuenta + "]";
	}
	
	

}
