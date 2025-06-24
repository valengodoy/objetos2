package ar.edu.info.unlp.ejercicioDemo;

public class VegetarianoBuilder  extends BuilderSandwich{
	
	public void armarPan() {
		this.getSandwich().setPan("Pan con semillas");
		this.getSandwich().setPrecioPan(120);
		
	}

	@Override
	public void armarAderezo() {
		this.getSandwich().setAderezo("");
		this.getSandwich().setPrecioAderezo(0);
		
	}

	@Override
	public void armarPrincipal() {
		this.getSandwich().setPrincipal("Provoleta grillada");
		this.getSandwich().setPrecioPrincipal(200);	
	}

	@Override
	public void armarAdicional() {
		this.getSandwich().setAdicional("Berenjenas al escabeche");
		this.getSandwich().setPrecioAdicional(100);
		
	}
	

}
