package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Reserva {
	private Integer cantidadDias;
	private LocalDate fecha;
	private Usuario conductor;
	private AutoEnAlquiler auto;
	
	
	public Reserva(Integer cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto) {
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.conductor = conductor;
		this.auto = auto;
	}
	
	
	public double montoAPagar() {
		return this.cantidadDias * this.auto.getPrecioPorDia();
	}
	
	public double montoAReembolsar() {
		return this.auto.getPolitica().montoAReembolsar(this, LocalDate.now());
	}


	public Integer getCantidadDias() {
		return cantidadDias;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public Usuario getConductor() {
		return conductor;
	}


	public AutoEnAlquiler getAuto() {
		return auto;
	}
	
	

}
