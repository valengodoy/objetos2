package ar.edu.unlp.info.oo2.biblioteca;
import java.util.*;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Sugerencia estrategia;
	
	
	public Decodificador(Sugerencia estra) {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.estrategia = estra;
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.grilla.add(pelicula);
		
	}
	 public void reproducir(Pelicula p) {
		 if (!reproducidas.contains(p))
			 reproducidas.add(p);
	   }
	

	 public void setEstrategia(Sugerencia estra) {
		 this.estrategia = estra;
	 }
	 
	 public List<Pelicula> sugerir(){
		return this.estrategia.sugerir(grilla, reproducidas);
	 }
}

