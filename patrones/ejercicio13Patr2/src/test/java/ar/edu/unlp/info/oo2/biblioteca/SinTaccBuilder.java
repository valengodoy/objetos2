package ar.edu.unlp.info.oo2.biblioteca;

public class SinTaccBuilder implements SandwichBuilder {
	private Sandwich s;

	@Override
	public void reset() {
		s = new Sandwich();
		
	}

	@Override
	public void setPan() {
		s.setPan(new Chipa());
		
	}

	@Override
	public void setAderezo() {
		s.setAderezo(new SalsaTartara());
		
	}

	@Override
	public void setPrincipal() {
		s.setPrincipal(new Pollo());
		
	}

	@Override
	public void setAdicional() {
		s.setAdicional(new Verduras());
		
	}

	@Override
	public Sandwich getSandwich() {
		// TODO Auto-generated method stub
		return this.s;
	}

	
}
