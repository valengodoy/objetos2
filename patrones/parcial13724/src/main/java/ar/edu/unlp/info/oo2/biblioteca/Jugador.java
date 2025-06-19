package ar.edu.unlp.info.oo2.biblioteca;
import java.util.*;

public class Jugador {
	private Bolsa bolsa;
	private String nombre;

	public Jugador(String nombre, Bolsa bolsa) {
		this.nombre = nombre;
		this.bolsa = bolsa;
	}
	
	public boolean agregarElemento(Elemento elem) {
		return this.bolsa.agregarElemento(elem);
	}
	
	
	public Elemento buscarNombre(String nombre) {
		return this.bolsa.buscarNombre(nombre);
	}
	
	public Bolsa espacioMasGrande() {
		return this.bolsa.espacioMasGrande();
	}
	
	 public int capacidadDisponible() {
	       return bolsa.capacidadDisponible();
	    }
}
