package ar.edu.info.unlp.ejercicioDemo;

import java.time.*;
import java.util.*;

public abstract class ElementoFile {
	protected String nombre;
	protected LocalDate fechaCreacion;
	
	public ElementoFile(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	public abstract int tamañoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract ElementoFile buscar(String nombre);
	public abstract String listaDeContenido(String car);
	
	public String getNombre() {
        return nombre;
    }
	
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public boolean equalsNombre(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	public void buscarTodos(String nombre, List<ElementoFile> lista) {
		if (this.equalsNombre(nombre)) lista.add(this);
		this.buscarEnHojas(nombre, lista);
	}
	protected abstract void buscarEnHojas(String nombre, List<ElementoFile> lista);
	
}
