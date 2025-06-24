package ar.edu.info.unlp.ejercicioDemo;

import java.time.Year;

public class Auto extends Prenda{
	private int modelo;
	private double km;
	private double costo0km;
	
	
	
	
	
	public Auto(int modelo, double km, double costo0km) {
		super();
		this.modelo = modelo;
		this.km = km;
		this.costo0km = costo0km;
	}
	
	public double getLiquidez() {
		// TODO Auto-generated method stub
		return 0.7;
	}
	
	
	public double getValor() {
		int antiguedad = Year.now().getValue() - this.modelo;
		double resta = this.costo0km * 0.10 * antiguedad;
		return Math.max(0, this.costo0km - resta); 
	}
	
}
