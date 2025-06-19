package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class WeatherDataDecorator implements WeatherData {
	
	private WeatherData component;
	
	
	
	public WeatherDataDecorator(WeatherData component) {
		super();
		this.component = component;
	}

	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.component.getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return this.component.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return this.component.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return this.component.getTemperaturas();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "Presion" + this.component.displayData() + "Radiacion "+this.component.getRadiacionSolar();
	}
	
}


