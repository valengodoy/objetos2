package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public interface Sugerencia {
	List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> reproducidas);
}
