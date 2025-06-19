package ar.edu.unlp.info.oo2.biblioteca;

public class Director {
	
	
	
	public Sandwich prepararSanguche(SandwichBuilder sb) {
		sb.reset();
		sb.setPan();
		sb.setPrincipal();
		sb.setAderezo();
		sb.setAdicional();
		return sb.getSandwich();

	}
	

	

}
