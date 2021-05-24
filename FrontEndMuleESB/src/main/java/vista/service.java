package vista;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class service implements Serializable {
	private static final long serialVersionUID = 1L;
	private int numCred;
	private String link;

	public service() {

		
		this.link = "https://secure.ftipgw.com/ArgoFire/validate.asmx/ValidCardLength?CardNumber=" + numCred;
		System.out.println("numero const" + numCred);

		 System.out.println("numero link dos"+link);
		// System.out.println("numero link "+numCred);

	}

	public int getNumCred() {
		return numCred;
	}

	public void setNumCred(int numCred) {
		this.numCred = numCred;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void qadd() {

		this.link = "https://secure.ftipgw.com/ArgoFire/validate.asmx/ValidCardLength?CardNumber=" + numCred;
		System.out.println("numero qadd:" + numCred);
		System.out.println("link:" + link);

		/*
		 * System.out.println("Maleeeeeeee"+numCred); link=
		 * "https://secure.ftipgw.com/ArgoFire/validate.asmx/ValidCardLength?CardNumber="
		 * +numCred; System.out.println("numero link "+link); //return null;
		 */

	}
}