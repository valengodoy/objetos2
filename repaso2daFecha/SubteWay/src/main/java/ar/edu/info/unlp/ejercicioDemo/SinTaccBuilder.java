package ar.edu.info.unlp.ejercicioDemo;

public class SinTaccBuilder  extends BuilderSandwich{
	public void armarPan() {
		this.getSandwich().setPan("Chipá");
		this.getSandwich().setPrecioPan(150);
		
	}

	@Override
	public void armarAderezo() {
		this.getSandwich().setAderezo("Salsa Tártara");
		this.getSandwich().setPrecioAderezo(18);
		
	}

	@Override
	public void armarPrincipal() {
		this.getSandwich().setPrincipal("Carne de pollo");
		this.getSandwich().setPrecioPrincipal(250);	
	}

	@Override
	public void armarAdicional() {
		this.getSandwich().setAdicional("Verduras grilladas");
		this.getSandwich().setPrecioAdicional(200);
		
	}
	

}
