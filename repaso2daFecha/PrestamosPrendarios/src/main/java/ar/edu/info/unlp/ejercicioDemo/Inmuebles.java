package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Inmuebles extends Prenda{
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;

	
	public Inmuebles(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}

	
	public double getLiquidez() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	public double getValor() {
		long meses = ChronoUnit.MONTHS.between(finContrato, comienzoContrato);
		return Math.max(0, meses) * costoMensual;
	}

		}
	


