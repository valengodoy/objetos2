package ar.edu.info.unlp.ejercicioDemo;

public class Alquileres extends Prenda{
	private String direccion;
	private double superficie;
	private double costom2;

	
	public Alquileres(String direccion, double superficie, double costom2) {
		super();
		this.direccion = direccion;
		this.superficie = superficie;
		this.costom2 = costom2;
	}

	
	public double getLiquidez() {
		// TODO Auto-generated method stub
		return 0.9;
	}

	
	public double getValor() {
		// TODO Auto-generated method stub
		return superficie * costom2;
	}

	
}
