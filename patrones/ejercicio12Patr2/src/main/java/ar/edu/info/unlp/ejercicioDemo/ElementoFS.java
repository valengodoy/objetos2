package ar.edu.info.unlp.ejercicioDemo;
import java.util.*;
import java.time.*;

public interface ElementoFS {
	String getNombre();
	int getTamaño();
	Archivo archivoMasGrande();
	Archivo archivoMasNuevo();
	ElementoFS buscar(String nombre);
	List<ElementoFS> buscarTodos(String nombre);
	String listadoContenido(String path);
	LocalDate getFechaCreacion();	
}
