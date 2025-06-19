package ar.edu.info.unlp.ejercicioDemo;

public abstract class PersonajeBuilder {
	private Personaje personaje;
	
	
	public void setNombre(String nombre) {
		this.personaje.setNombre(nombre);
	}
	
	public abstract void setArma();
	public abstract void setArmadura();
	public abstract void setHabilidades();
	
	 public void reset() {
	        this.personaje = new Personaje();
	    }
	
	
	public Personaje getPersonaje() {
		return this.personaje;
	}
}
