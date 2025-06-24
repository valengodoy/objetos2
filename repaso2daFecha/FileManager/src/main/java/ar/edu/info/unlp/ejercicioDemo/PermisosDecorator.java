package ar.edu.info.unlp.ejercicioDemo;

public class PermisosDecorator extends FileDecorator{

	public PermisosDecorator(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}


	public String prettyPrint() {
			// TODO Auto-generated method stub
			return this.getComponent().prettyPrint() + " - " + this.getPermisos();
	}

}
