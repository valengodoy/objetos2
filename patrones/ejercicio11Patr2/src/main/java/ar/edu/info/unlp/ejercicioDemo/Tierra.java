package ar.edu.info.unlp.ejercicioDemo;

public class Tierra implements Topografia{

	@Override
	public double proporcionAgua() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean equals(Object obj) {
		return (obj instanceof Tierra);
	}
}
