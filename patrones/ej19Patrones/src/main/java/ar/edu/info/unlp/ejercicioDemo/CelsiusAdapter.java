package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusAdapter implements WeatherData{
	private HomeWeatherStation station;
	
	

	public CelsiusAdapter(HomeWeatherStation station) {
		this.station = station;
	}

	@Override
	public double getTemperatura() {	
		return (station.getTemperatura() - 32) / 1.8;
	}

	@Override
	public double getPresion() {
		return this.station.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return this.station.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.getTemperaturas().stream().map(t -> this.getTemperatura()).collect(Collectors.toList());
	}

	@Override
	public String displayData() {
		
		return "temperatura C°" + this.getTemperatura() + this.getPresion() + this.getRadiacionSolar();
	}

}
