package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class HomeWeatherDataDecorator implements WeatherData {
	private WeatherData component;
	
	
	
	public HomeWeatherDataDecorator(WeatherData component) {
		this.component = component;
	}

	@Override
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
	public double getRadiacion() {
		// TODO Auto-generated method stub
		return this.component.getRadiacion();
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return this.component.getTemperaturas();
	}

	@Override
	public String displayData() {
		return this.component.displayData();	}
}
