package ar.edu.info.unlp.ejercicioDemo;

public class PersonajeDirector {
	private PersonajeBuilder builder;
	
	
	
	
	public PersonajeDirector(PersonajeBuilder builder) {
		this.builder = builder;
	}
	
	
	
	public Personaje build(String nombre) {
		builder.setNombre(nombre);
		builder.setArma();
		builder.setArmadura();
		builder.setHabilidades();
		return this.builder.getPersonaje();
		
	}
}
