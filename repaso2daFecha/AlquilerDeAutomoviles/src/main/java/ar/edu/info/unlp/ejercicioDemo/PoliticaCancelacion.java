package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface PoliticaCancelacion {
	
	double montoReembolso(double total, LocalDate fechaInicio, LocalDate fechaCanc);
	



}
