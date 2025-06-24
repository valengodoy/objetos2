package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent{
	private FileComponent component;

	public FileDecorator(FileComponent component) {
		super();
		this.component = component;
	}
	

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.component.getExtension();
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.component.getFechaCreacion();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.component.getPermisos();
	}

	@Override
	public double getTamaño() {
		// TODO Auto-generated method stub
		return this.component.getTamaño();
	}
	
	public FileComponent getComponent() {
		return this.component;
	}

}
