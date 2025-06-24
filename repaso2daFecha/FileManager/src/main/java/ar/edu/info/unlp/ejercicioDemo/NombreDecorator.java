package ar.edu.info.unlp.ejercicioDemo;

public class NombreDecorator extends FileDecorator{

	public NombreDecorator(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.getComponent().prettyPrint() + " - " + this.getNombre();
	}

}
