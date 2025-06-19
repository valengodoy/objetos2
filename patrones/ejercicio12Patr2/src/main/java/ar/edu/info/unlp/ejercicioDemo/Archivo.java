package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo implements ElementoFS {
	private String name;
	private int tamaño;
	private LocalDate fechaCreacion;
	
	

	public Archivo(String name, int tamaño, LocalDate fechaCreacion) {
		this.name = name;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String getNombre() {
		
		return this.name;
	}

	@Override
	public int getTamaño() {
		// TODO Auto-generated method stub
		return this.tamaño;
	}

	@Override
	public Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public ElementoFS buscar(String nombre) {
		 return this.getNombre().equals(nombre) ? this : null;
	}

	@Override
	public List<ElementoFS> buscarTodos(String nombre) {
		List<ElementoFS> resultado = new ArrayList<>();
        if (this.getNombre().equals(nombre)) resultado.add(this);
        return resultado;
	}

	@Override
	public String listadoContenido(String path) {
        return path + "/" + this.getNombre() + "\n";

	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

}
