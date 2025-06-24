package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends ElementoFile{
	private int tamaño;
	
	

	public Archivo(String nombre, LocalDate fechaCreacion, int tamaño) {
		super(nombre, fechaCreacion);
		this.tamaño = tamaño;
	}

	@Override
	public int tamañoTotalOcupado() {
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
	public ElementoFile buscar(String nombre) {
		return this.equalsNombre(nombre) ? this: null;
	}


	@Override
	public String listaDeContenido(String car) {
		return car + this.getNombre();
	}

	@Override
	protected void buscarEnHojas(String nombre, List<ElementoFile> lista) {
		// TODO Auto-generated method stub
		
	}

}
