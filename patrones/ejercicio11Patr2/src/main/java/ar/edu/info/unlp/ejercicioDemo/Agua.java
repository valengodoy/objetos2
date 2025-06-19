package ar.edu.info.unlp.ejercicioDemo;

public class Agua implements Topografia{

	@Override
	public double proporcionAgua() {
		// TODO Auto-generated method stub
		return 1;
	}
	

	public boolean equals(Object obj) {
		return (obj instanceof Agua);
	}

}
