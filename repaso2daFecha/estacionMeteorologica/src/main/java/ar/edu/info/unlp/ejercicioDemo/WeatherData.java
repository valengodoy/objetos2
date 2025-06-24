package ar.edu.info.unlp.ejercicioDemo;
import java.util.*;

public interface WeatherData {
	double getTemperatura();
	double getPresion();
	double getRadiacion();
	List<Double> getTemperaturas();
	String displayData();
	
}
