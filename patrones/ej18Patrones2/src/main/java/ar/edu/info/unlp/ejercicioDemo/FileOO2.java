package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileOO2  implements FileComponent{
	private String nombre;
	private String extension;
	private String tamaño;
	private LocalDate fechaModif;
	private LocalDate fechaCrea;
	private String permisos;
	
	

	public FileOO2(String nombre, String extension, String tamaño, LocalDate fechaModif, LocalDate fechaCrea, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaModif = fechaModif;
		this.fechaCrea = fechaCrea;
		this.permisos = permisos;
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.getNombre();
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}

	@Override
	public String getTam() {
		// TODO Auto-generated method stub
		return this.tamaño;
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCrea;
	}

	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.fechaModif;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}

}
