package ar.edu.info.unlp.ejercicioDemo;
import java.util.*;

public class FileSystem {
	private Directorio raiz;
	
	 public int tamanoTotalOcupado() {
		return raiz.getTamaño();
	 }

	 
	  public Archivo archivoMasGrande() {
		return  raiz.archivoMasGrande();
	  }

	  
	  public Archivo archivoMasNuevo() {
		  return raiz.archivoMasNuevo();
	  }

	  public ElementoFS buscar(String nombre){
		  return raiz.buscar(nombre);
	  }

	
	  public List<ElementoFS> buscarTodos(String nombre){
		  return raiz.buscarTodos(nombre);
	  }

	  
	  public String listadoDeContenido() {
		  return raiz.listadoContenido("");
	}



}
