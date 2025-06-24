package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class HomeWatherData implements WeatherData{
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.temperatura;
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return this.presion;
	}

	@Override
	public double getRadiacion() {
		// TODO Auto-generated method stub
		return this.radiacionSolar;
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return this.temperaturas;
	}

	@Override
	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() +
			   	  "Presión atmosf: " + this.getPresion() +
			   	  "Radiación solar: " + this.getRadiacion();
	}

}
