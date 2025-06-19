package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class ExtensionDecorador extends FileDecorator {

	public ExtensionDecorador(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}


	
	
	

}
