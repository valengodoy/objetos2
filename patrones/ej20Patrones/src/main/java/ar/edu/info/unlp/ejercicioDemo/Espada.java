package ar.edu.info.unlp.ejercicioDemo;

public class Espada implements Arma{

	@Override
	public int dañoContraCuero() {
		return 8;
	}

	@Override
	public int dañoContraHierro() {
		return 5;
	}

	@Override
	public int dañoContraAcero() {
		return 3;
	}

}
