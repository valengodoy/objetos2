package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent{
	
	private FileComponent component;
	
	
	public FileDecorator(FileComponent component) {
		this.component = component;
	}
	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.component.prettyPrint();
	}

	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.component.getExtension();
	}

	@Override
	public String getTam() {
		// TODO Auto-generated method stub
		return this.component.getTam();
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.component.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.component.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.component.getPermisos();
	}



	
	
}
