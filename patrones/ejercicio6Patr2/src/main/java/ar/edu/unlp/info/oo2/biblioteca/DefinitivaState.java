package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class DefinitivaState implements State{

	@Override
	public void inscribirUsuario(Excursion exc, Usuario usuario) {
		exc.getInscriptos().add(usuario);
	    if (exc.getInscriptos().size() >= exc.getCupoMaximo()) {
	        exc.setEstado(new EsperaState());
	    }
		
	}

	@Override
	public String obtenerInfromacion(Excursion exc, List<Usuario> inscriptos) {
		// TODO Auto-generated method stub
		int faltantes = exc.getCupoMaximo() - exc.getInscriptos().size();
		return "Info" + exc.getNombre() + exc.getCosto() + exc.getPuntoEncuentro() + faltantes;
	}

}
