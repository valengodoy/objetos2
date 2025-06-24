package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion{

	@Override
	public double montoReembolso(double total, LocalDate fechaInicio, LocalDate fechaCanc) {
		long dias = ChronoUnit.DAYS.between(fechaInicio, fechaCanc);
		if(dias >= 7) {
			return total;
		}
		else if(dias >=2) {
			return total * 0.5;
		}
		else 
			return 0;
	}

}
