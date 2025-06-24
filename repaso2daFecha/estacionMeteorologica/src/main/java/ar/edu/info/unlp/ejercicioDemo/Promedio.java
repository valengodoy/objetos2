package ar.edu.info.unlp.ejercicioDemo;

import java.util.Locale;
import java.util.OptionalDouble;

public class Promedio extends HomeWeatherDataDecorator{

	public Promedio(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	public String displayData() {
		OptionalDouble prom = this.getTemperaturas().stream().mapToDouble(t -> getTemperatura()).average();
        return super.displayData() + String.format(Locale.US, " Promedio: %.0f;", prom);    
	}
	
}
