package ar.edu.info.unlp.ejercicioDemo;

public class NombreTamPermisosExtStrategy implements StrategyVisualizacion{

	@Override
	public String prettyPrint(FileOO2 file) {
		return file.getNombre() + file.getTamaño() + file.getExtension();
	}

}
