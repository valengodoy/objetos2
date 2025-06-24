package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{
	private String nombre;
	private String extension;
	private LocalDate fechaModificacion;
	private LocalDate fechaCreacion;
	private double tamaño;
	private String permisos;
	
	

	public FileOO2(String nombre, String extension, LocalDate fechaModificacion, LocalDate fechaCreacion, double tamaño,String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.fechaModificacion = fechaModificacion;
		this.fechaCreacion = fechaCreacion;
		this.tamaño = tamaño;
		this.permisos = permisos;
	}

	@Override
	public String prettyPrint() {
		return this.nombre;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}

	@Override
	public double getTamaño() {
		// TODO Auto-generated method stub
		return this.tamaño;
	}

}
