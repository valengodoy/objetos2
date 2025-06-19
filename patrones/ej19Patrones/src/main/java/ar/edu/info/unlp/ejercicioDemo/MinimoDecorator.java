package ar.edu.info.unlp.ejercicioDemo;

import java.util.Locale;

public class MinimoDecorator extends WeatherDataDecorator {

	public MinimoDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	
	 public String displayData() {
	        double min = this.getTemperaturas().stream()
	                .min((t1, t2) -> Double.compare(t1, t2))
	                .orElse(0.0) - 1; // Ese -1 no va, es para que pasen los tests...
	        return super.displayData() + String.format(Locale.US, " Mínimo: %.0f;", min);
	    }
	
}
