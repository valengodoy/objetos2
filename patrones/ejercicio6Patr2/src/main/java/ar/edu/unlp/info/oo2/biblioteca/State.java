package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public interface State {
	void inscribirUsuario(Excursion exc, Usuario usuario);
	String obtenerInfromacion(Excursion exc, List<Usuario> inscriptos);
}
