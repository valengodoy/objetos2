package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface PoliticaCancelacion {
	double montoAReembolsar(Reserva res, LocalDate hoy);
}
