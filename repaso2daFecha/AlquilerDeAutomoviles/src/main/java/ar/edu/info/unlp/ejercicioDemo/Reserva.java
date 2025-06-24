package ar.edu.info.unlp.ejercicioDemo;

import java.time.*;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private AutoEnAlquiler auto;
	private Usuario conductor;
	
	public Reserva(int cantidadDias, AutoEnAlquiler auto, Usuario conductor) {
		super();
		this.cantidadDias = cantidadDias;
		this.fecha = LocalDate.now();
		this.auto = auto;
		this.conductor = conductor;
	}
	
	public double montoAPagar() {
		return this.auto.getPrecioPorDia() * this.cantidadDias;
	}
	
	public double montoAReembolsar() {
		return this.auto.getPolitica().montoReembolso(montoAPagar(), fecha, LocalDate.now());
	}
	
	
	
	

}
