package ar.edu.info.unlp.ejercicioDemo;

import java.time.*;

public interface FileComponent {
	String prettyPrint();
	String getNombre();
	String getExtension();
	LocalDate getFechaCreacion();
	String getPermisos();
	double getTamaño();


}
