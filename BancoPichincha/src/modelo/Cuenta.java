package modelo;

import java.util.List;


public class Cuenta {
	

	private String num_cuenta_ced;
	private String nombres;
	private String apellidos;
	private double saldo;
	
    private List<Transaccion> transacciones;

	public String getNum_cuenta_ced() {
		return num_cuenta_ced;
	}

	public void setNum_cuenta_ced(String num_cuenta_ced) {
		this.num_cuenta_ced = num_cuenta_ced;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	@Override
	public String toString() {
		return "Cuenta [num_cuenta_ced=" + num_cuenta_ced + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", saldo=" + saldo + ", transacciones=" + transacciones + "]";
	}
	
	
	

}
