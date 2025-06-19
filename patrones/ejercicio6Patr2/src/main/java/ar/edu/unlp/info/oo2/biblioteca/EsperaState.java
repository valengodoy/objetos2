package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class EsperaState implements State{

	@Override
	public void inscribirUsuario(Excursion exc, Usuario usuario) {
		exc.getListaDeEspera().add(usuario);
	}

	@Override
	public String obtenerInfromacion(Excursion exc, List<Usuario> inscriptos) {
		
		return "Info" + exc.getCosto() + exc.getNombre() + exc.getFechaFin() + exc.getFechaInicio() + exc.getPuntoEncuentro();
	}

}
