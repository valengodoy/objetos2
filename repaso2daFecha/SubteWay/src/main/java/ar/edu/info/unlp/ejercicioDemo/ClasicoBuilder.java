package ar.edu.info.unlp.ejercicioDemo;

public class ClasicoBuilder extends BuilderSandwich{

	@Override
	public void armarPan() {
		this.getSandwich().setPan("Brioche");
		this.getSandwich().setPrecioPan(100);
		
	}

	@Override
	public void armarAderezo() {
		this.getSandwich().setAderezo("Mayonesa");
		this.getSandwich().setPrecioAderezo(20);
		
	}

	@Override
	public void armarPrincipal() {
		this.getSandwich().setPrincipal("Carne de ternera");
		this.getSandwich().setPrecioPrincipal(300);	
	}

	@Override
	public void armarAdicional() {
		this.getSandwich().setAdicional("Tomate");
		this.getSandwich().setPrecioAdicional(80);
		
	}
	
	

}
