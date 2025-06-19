package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class ProvisoriaState implements State{

	@Override
	public void inscribirUsuario(Excursion exc, Usuario usuario) {
		exc.getInscriptos().add(usuario);
	    if (exc.getInscriptos().size() >= exc.getCupoMinimo()) {
	        exc.setEstado(new DefinitivaState());
	    }
		
	}

	@Override
	public String obtenerInfromacion(Excursion exc, List<Usuario> inscriptos) {
		int restantes =  exc.getCupoMinimo() - exc.getInscriptos().size();
		
		return "Info: " + exc.getNombre() + exc.getFechaFin() + exc.getFechaInicio() + exc.getPuntoEncuentro() + restantes;
	}

}
