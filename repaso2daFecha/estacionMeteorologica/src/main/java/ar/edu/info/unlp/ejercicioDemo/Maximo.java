package ar.edu.info.unlp.ejercicioDemo;

import java.util.Locale;

public class Maximo extends HomeWeatherDataDecorator{

	public Maximo(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		double max = this.getTemperaturas().stream()
                .max((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
        return super.displayData() + String.format(Locale.US, " Máximo: %.0f;", max);
	}
}
