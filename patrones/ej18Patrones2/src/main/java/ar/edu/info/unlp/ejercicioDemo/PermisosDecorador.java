package ar.edu.info.unlp.ejercicioDemo;

public class PermisosDecorador extends FileDecorator {

	public PermisosDecorador(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermisos();
	}

}
