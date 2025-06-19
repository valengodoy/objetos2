package ar.edu.info.unlp.ejercicioDemo;

import java.util.Arrays;

public class ArqueroBuilder extends PersonajeBuilder{

	@Override
	public void setArma() {
		this.getPersonaje().setArma(new Arco());
	}

	@Override
	public void setArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraDeCuero());
		
	}

	@Override
	public void setHabilidades() {
		this.getPersonaje().setHabilidades(Arrays.asList("Combate a distancia"));
	}
	

}
