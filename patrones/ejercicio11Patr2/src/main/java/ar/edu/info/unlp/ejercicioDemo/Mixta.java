package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class Mixta implements Topografia{
	private List<Topografia> topo;
	
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.topo = new ArrayList<>();
		this.topo.add(t1);
		this.topo.add(t2);
		this.topo.add(t3);
		this.topo.add(t4);
	}


	@Override
	public double proporcionAgua() {
		return this.topo.stream().mapToDouble(t -> t.proporcionAgua()).sum() /4;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Mixta)) return false;
		Mixta otra = (Mixta) obj;
		return this.topo.equals(otra.topo);
	}

}
