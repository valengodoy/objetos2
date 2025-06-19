package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Bolsa implements Elemento{
	private int capacidad;
	private List<Elemento> elementos;
	private String nombre;
	
	public Bolsa(int capacidad, List<Elemento> bolsa, String nombre) {
		this.elementos = new ArrayList<>();
		this.nombre = nombre;
		
	}
	
	
	@Override
	public boolean agregarElemento(Elemento elem) {
		if(this.elementos.size() + elem.getEspacioOcupado() <= this.capacidad) {
			return this.elementos.add(elem);
		}
		else
			return this.elementos.stream().anyMatch(item -> item.agregarElemento(elem));
	} 
	@Override
	public Elemento buscarNombre(String nombre) {
		return this.elementos.stream().filter(item -> item.getNombre().equals(nombre)).findFirst().orElse(null);
	
	}
	@Override
	public int capacidadDisponible() {
		return getDisponible() + this.elementos.stream().mapToInt(i -> i.capacidadDisponible()).sum();	
	}

	@Override
	public Bolsa espacioMasGrande() {
		if(this.elementos.isEmpty()) {
			return this;
		}
		return this.elementos.stream().map(Elemento::espacioMasGrande).filter(Objects::nonNull).max(Comparator.comparingInt(Elemento::getDisponible)).orElse(null);
		
	}
	@Override
	public String getNombre() {
	return 	this.nombre;
		
	}


	public int getDisponible() {
		return this.capacidad - this.elementos.size();
	}


	@Override
	public int getEspacioOcupado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
