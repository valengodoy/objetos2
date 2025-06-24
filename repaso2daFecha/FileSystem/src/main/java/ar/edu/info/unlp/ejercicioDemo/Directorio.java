package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Directorio extends ElementoFile{
	private List<ElementoFile> contenido;
	
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		// TODO Auto-generated constructor stub
		this.contenido = new ArrayList<>();
	}
	
	public void agregarElemento(ElementoFile elem) {
		this.contenido.add(elem);
	}

	@Override
	public int tamañoTotalOcupado() {
		// TODO Auto-generated method stub
		return 32 + this.contenido.stream().mapToInt(e -> e.tamañoTotalOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return contenido.stream().map(elem -> elem.archivoMasGrande())
        		.max((archivo1, archivo2) -> Integer.compare(archivo1.tamañoTotalOcupado(), archivo2.tamañoTotalOcupado())) 
                .orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return contenido.stream().map(elem -> elem.archivoMasNuevo())
        		.max((archivo1, archivo2) -> archivo1.getFechaCreacion().compareTo(archivo2.getFechaCreacion())) 
                .orElse(null);
	}

	@Override
	public ElementoFile buscar(String nombre) {
		// TODO Auto-generated method stub
		 return this.equalsNombre(nombre) ? this : 
     		this.contenido.stream().map(elem -> elem.buscar(nombre))
             .filter(elemento -> elemento != null).findFirst().orElse(null);
	}

	
	@Override
	public String listaDeContenido(String car) {
		// TODO Auto-generated method stub
		 StringBuilder resultado = new StringBuilder();
	        String pathActual = car + this.getNombre();
	        resultado.append(pathActual).append("\n");
	        resultado.append(
	            contenido.stream().map(elem -> elem.listaDeContenido(pathActual + "/"))
	                .collect(Collectors.joining())
	        );
	        return resultado.toString();
	}

	@Override
	protected void buscarEnHojas(String nombre, List<ElementoFile> lista) {
		this.contenido.stream().forEach(elem -> elem.buscarTodos(nombre, lista));
		
	}

}
