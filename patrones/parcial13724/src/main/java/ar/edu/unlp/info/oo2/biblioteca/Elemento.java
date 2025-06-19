package ar.edu.unlp.info.oo2.biblioteca;

public interface Elemento {
	boolean agregarElemento(Elemento elem);
	Elemento buscarNombre(String nombre);
	int capacidadDisponible();	
	Bolsa espacioMasGrande();
	String getNombre();
	int getDisponible();
	int getEspacioOcupado();
}
