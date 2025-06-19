package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class HomeWeatherStation implements WeatherData{
	private double temperatura;
	private double presion;
	private double radiacion;
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
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return this.radiacion;
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "Presion" + this.getPresion() + "Radiacion "+this.getRadiacionSolar();
	}
	
}
