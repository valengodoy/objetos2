package ar.edu.info.unlp.ejercicioDemo;

public class ArmaduraDeHierro implements Armadura{

	@Override
	public int recibirDaño(Arma arma) {
		return arma.dañoContraHierro();
	}

}
