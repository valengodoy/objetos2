package ar.edu.info.unlp.ejercicioDemo;

public class NombreFechaExtStrategy implements StrategyVisualizacion{

	@Override
	public String prettyPrint(FileOO2 file) {
		return file.getNombre() + file.getFechaCreacion() + file.getExtension();
	}

}
