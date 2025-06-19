package ar.edu.info.unlp.ejercicioDemo;

public class FechaCreacionDecorador extends FileDecorator{

	public FechaCreacionDecorador(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaCreacion();
	}

}
