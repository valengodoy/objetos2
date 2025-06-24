package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia {
	private List<Topografia> topografias;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		 this.topografias = new ArrayList<>();
	     this.topografias.add(t1);
	     this.topografias.add(t2);
	     this.topografias.add(t3);
	     this.topografias.add(t4);
	    }

	    @Override
	    public double proporcionAgua() {
	        return topografias.stream()
	                .mapToDouble(Topografia::proporcionAgua)
	                .sum() / 4;
	    }

	    public List<Topografia> getComponentes() {
	        return this.topografias;
	    }
	    
	    public boolean equals(Object obj) {
	        if (!(obj instanceof Mixta)) return false;
	        Mixta otra = (Mixta) obj;
	        return this.topografias.equals(otra.getComponentes());
	    }
}

	

