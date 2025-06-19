package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.*;

public class Directorio implements ElementoFS{
	private List<ElementoFS> elementos;
	private String name;
	private LocalDate fechaCreacion;
	
	public Directorio(String nombre, LocalDate fecha) {
       this.name=nombre;
       this.fechaCreacion = fecha;
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoFS e) {
        this.elementos.add(e);
    }

	@Override
	public String getNombre() {
		return this.name;
	}

	@Override
	public int getTamaño() {
		return 32 * this.elementos.stream().mapToInt(e -> e.getTamaño()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		return this.elementos.stream()
	            .map(ElementoFS::archivoMasGrande)
	            .filter(Objects::nonNull)
	            .max(Comparator.comparingInt(Archivo::getTamaño))
	            .orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.elementos.stream()
	            .map(ElementoFS::archivoMasGrande)
	            .filter(Objects::nonNull)
	            .max(Comparator.comparing(Archivo::getFechaCreacion))
	            .orElse(null);
	}

	@Override
	public ElementoFS buscar(String nombre) {
		if (this.getNombre().equals(nombre)) return this;

	    for (ElementoFS e : elementos) {
	    	ElementoFS encontrado = e.buscar(nombre);
	        if (encontrado != null) return encontrado;
	        }

		return null;
	}

	@Override
	public List<ElementoFS> buscarTodos(String nombre) {
		
		 List<ElementoFS> resultados = new ArrayList<>();
	        if (this.getNombre().equals(nombre)) resultados.add(this);

	        for (ElementoFS e : elementos) {
	            resultados.addAll(e.buscarTodos(nombre));
	        }

	        return resultados;
	    }

	@Override
	public String listadoContenido(String path) {
		  StringBuilder sb = new StringBuilder();
	        String nuevoPath = path + "/" + this.getNombre();
	        sb.append(nuevoPath).append("\n");

	        for (ElementoFS e : elementos) {
	            sb.append(e.listadoContenido(nuevoPath));
	        }

	        return sb.toString();
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

}
