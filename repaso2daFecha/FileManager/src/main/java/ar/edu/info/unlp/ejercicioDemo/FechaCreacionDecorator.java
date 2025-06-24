package ar.edu.info.unlp.ejercicioDemo;

public class FechaCreacionDecorator extends FileDecorator{

	public FechaCreacionDecorator(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.getComponent().prettyPrint() + " - " + this.getFechaCreacion().toString();
	}
}
