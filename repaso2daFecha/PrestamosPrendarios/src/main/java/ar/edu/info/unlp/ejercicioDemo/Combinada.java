package ar.edu.info.unlp.ejercicioDemo;
import java.util.*;

public class Combinada extends Prenda{
	private List<Prenda> prendas;
	
	
	public Combinada() {
		super();
		this.prendas = new ArrayList<>();
		
	}
	
	public void addPrenda(Prenda prenda) {
		this.prendas.add(prenda);
	}

	
	public double getLiquidez() {
		// TODO Auto-generated method stub
		return 0.5;
	}

	
	public double getValor() {
		return this.prendas.stream().mapToDouble(p -> p.getValor()).sum();
	}

	
	
	

}
