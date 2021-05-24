package vista;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class GestionBean {
	
	private String bancoOrigen="";
	private String bancoDestino="";
	private String cuentaOrigen="";
	private String cuentaDestino="";
	private double monto=0;
	
	private String opcion="";
	
	private String url="page1.xhtml";
	
	public String getBancoOrigen() {
		return bancoOrigen;
	}
	public void setBancoOrigen(String bancoOrigen) {
		this.bancoOrigen = bancoOrigen;
	}
	public String getBancoDestino() {
		return bancoDestino;
	}
	public void setBancoDestino(String bancoDestino) {
		this.bancoDestino = bancoDestino;
	}
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
	
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String ejecutarESB() {
		
		System.out.println(bancoOrigen + bancoDestino);	
		
		
		
		
		System.out.println(bancoOrigen + bancoDestino);		
		System.out.println("Esto llega:"+opcion);
		url= "http://localhost:1515/transacciones/"+bancoOrigen+"/"+bancoDestino+"?i="+bancoOrigen+"&co="+cuentaOrigen+"&cd="+cuentaDestino+"&m="+monto;
		
		System.out.println("Url de saslida: "+url);
		return url;
	}
	
}
