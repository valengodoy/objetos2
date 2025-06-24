package ar.edu.info.unlp.ejercicioDemo;

public abstract class Prenda {
	public abstract double getLiquidez();
	public abstract double getValor();
	
	public double getValorPrendario() {
		return getLiquidez() * getValor();
	}
}
