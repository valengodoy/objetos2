package ar.edu.unlp.info.oo2.biblioteca;

public class Item implements Elemento {

	@Override
	public boolean agregarElemento(Elemento elem) {	
		return false;
	}

	@Override
	public Elemento buscarNombre(String nombre) {
		return null;
	}

	@Override
	public int capacidadDisponible() {
		return 0;
	}

	@Override
	public Bolsa espacioMasGrande() {
		return null;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEspacioOcupado() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
