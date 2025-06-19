package ar.edu.unlp.info.oo2.biblioteca;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NovedadSugerencia implements Sugerencia {

	@Override
	public List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> reproducidas) {
		return grilla.stream().filter(p -> !reproducidas.contains(p))
		        .sorted(Comparator.comparingInt(Pelicula::getAño).reversed())
		        .limit(3).collect(Collectors.toList());
		}
	}


