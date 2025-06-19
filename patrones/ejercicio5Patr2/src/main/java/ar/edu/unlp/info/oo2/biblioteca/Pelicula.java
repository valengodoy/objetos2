package ar.edu.unlp.info.oo2.biblioteca;
import java.util.*;

public class Pelicula {
	private String titulo;
	private int año;
	private List<Pelicula> similares;
	private double puntaje;
	
	
	public Pelicula(String titulo, int año, double puntaje) {
		this.titulo = titulo;
		this.año = año;
		this.puntaje = puntaje;
		this.similares = new ArrayList<>();
	}
	
	public void agregarSimilar(Pelicula pelicula) {
		this.similares.add(pelicula);
		pelicula.getSimilares().add(this);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	
	
	
	
	 
	
	
}
