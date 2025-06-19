package ar.edu.info.unlp.ejercicioDemo;

public class ArmaduraDeAcero implements Armadura{

	@Override
	public int recibirDaño(Arma arma) {
		return arma.dañoContraAcero();
	}

}
