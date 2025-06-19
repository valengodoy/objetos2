package ar.edu.info.unlp.ejercicioDemo;

public class NombreDecorador extends FileDecorator {

	public NombreDecorador(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre();
	}

}
