package negocio;

import javax.xml.ws.Endpoint;

public class PublishService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8082/WS/Transferencia", new Transferencia());
		System.out.println("Finalizado");

	}

}
