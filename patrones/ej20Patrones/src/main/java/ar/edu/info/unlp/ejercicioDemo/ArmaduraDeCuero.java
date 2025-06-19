package ar.edu.info.unlp.ejercicioDemo;

public class ArmaduraDeCuero implements Armadura{

	@Override
	public int recibirDaño(Arma arma) {
		return arma.dañoContraCuero();
	}

}
