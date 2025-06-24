package ar.edu.info.unlp.ejercicioDemo;

import java.util.Locale;

public class Minimo extends HomeWeatherDataDecorator {

	public Minimo(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		double min = this.getTemperaturas().stream()
                .min((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
        return super.displayData() + String.format(Locale.US, " Minimo: %.0f;", min);
	}
}
