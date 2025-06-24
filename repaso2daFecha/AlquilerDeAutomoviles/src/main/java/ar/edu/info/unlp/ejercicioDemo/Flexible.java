package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{

	@Override
	public double montoReembolso(double total, LocalDate fechaInicio, LocalDate fechaCanc) {
		return total;
	}

}
