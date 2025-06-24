package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class FileSystem {
	private Directorio raiz;

	
	  public int tamanoTotalOcupado() {
		 return this.raiz.tamañoTotalOcupado();
	  }
	  
	 
	  public Archivo archivoMasGrande() {
		 return this.raiz.archivoMasGrande();
	  }

	  
	  public Archivo archivoMasNuevo() {
		  return this.raiz.archivoMasNuevo();
	  }

	
	  public ElementoFile buscar(String nombre) {
		  return this.raiz.buscar(nombre);
	  }

	  
	  public List<ElementoFile> buscarTodos(String nombre){
		  List<ElementoFile> elem = new ArrayList<>();
		  this.raiz.buscarTodos(nombre, elem);
		  return elem;
	  }

	
	  public String listadoDeContenido() {
		  return this.raiz.listaDeContenido("/");
	}

	
}
