package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion {

	@Override
	public double montoAReembolsar(Reserva res, LocalDate hoy) {
		return res.montoAPagar();
	}

}
