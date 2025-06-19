package ar.edu.info.unlp.ejercicioDemo;

public class TamañoDecorador extends FileDecorator{

	public TamañoDecorador(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getTam();
	}

	
}
