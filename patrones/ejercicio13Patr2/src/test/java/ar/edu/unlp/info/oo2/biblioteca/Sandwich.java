package ar.edu.unlp.info.oo2.biblioteca;

public class Sandwich {
	private Pan pan;
	private Principal principal;
	private Aderezo aderezo;
	private Adicional adicional;
	
	
	
	public double getPrecio() {
		return pan.getPrecio() + aderezo.getPrecio() + principal.getPrecio() + adicional.getPrecio();
	}



	public void setPan(Pan pan) {
		this.pan = pan;
	}



	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}



	public void setAderezo(Aderezo aderezo) {
		this.aderezo = aderezo;
	}



	public void setAdicional(Adicional adicional) {
		this.adicional = adicional;
	}
	
	
	
	
}
