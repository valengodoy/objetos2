package ar.edu.unlp.info.oo2.biblioteca;

public class Usuario {
	private String nombreApellido;
	private String email;
	
	
	
	
	public Usuario(String nombreApellido, String email) {
		this.nombreApellido = nombreApellido;
		this.email = email;
	}




	public String getNombreApellido() {
		return nombreApellido;
	}




	public String getEmail() {
		return email;
	}
	
	
	 

}
