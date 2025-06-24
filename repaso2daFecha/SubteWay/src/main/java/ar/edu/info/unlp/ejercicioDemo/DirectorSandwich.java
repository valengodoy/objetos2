package ar.edu.info.unlp.ejercicioDemo;

public class DirectorSandwich {
	
	public Sandwich build(BuilderSandwich sb) {
		sb.reset();
		sb.armarPan();
		sb.armarAderezo();
		sb.armarPrincipal();
		sb.armarAdicional();
		return sb.getSandwich();
	}

	
	
}
