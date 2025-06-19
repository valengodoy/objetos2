package ar.edu.info.unlp.ejercicioDemo;

import java.time.*;

public class FileOO2 {
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	
	private StrategyVisualizacion estrategia;
	

	public FileOO2(String nombre, String extension, double tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion,
			StrategyVisualizacion estrategia) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estrategia = estrategia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public StrategyVisualizacion getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(StrategyVisualizacion estrategia) {
		this.estrategia = estrategia;
	}
	
	public void prettyPrint() {
		this.estrategia.prettyPrint(this);
	}
	

}
