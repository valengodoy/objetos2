package ar.edu.info.unlp.ejercicioDemo;

public abstract class BuilderSandwich {
	private Sandwich sandwich;

	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public abstract void armarPan();
	public abstract void armarAderezo();
	public abstract void armarPrincipal();
	public abstract void armarAdicional();
	
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
}
