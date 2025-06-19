package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaCancelacion{

	@Override
	public double montoAReembolsar(Reserva res, LocalDate hoy) {
		long dias = ChronoUnit.DAYS.between(res.getFecha(), hoy);
		if(dias >= 7) {
			return res.montoAPagar();
		}
		else if(dias <= 2) {
			return res.montoAPagar()/2;
		}
		return 0;
	}

}
