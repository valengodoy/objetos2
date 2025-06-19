package ar.edu.info.unlp.ejercicioDemo;

public class NombreExtensionStrategy implements StrategyVisualizacion {

	@Override
	public String prettyPrint(FileOO2 file) {
		return file.getNombre() + file.getExtension();
	}

}
