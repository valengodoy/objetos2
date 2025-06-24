package ar.edu.info.unlp.ejercicioDemo;

public class ExtensionDecorator extends FileDecorator{

	public ExtensionDecorator(FileComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.getComponent().prettyPrint() + " - " + this.getExtension();
	}

}
