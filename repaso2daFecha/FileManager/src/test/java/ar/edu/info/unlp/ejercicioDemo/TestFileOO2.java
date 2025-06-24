package ar.edu.info.unlp.ejercicioDemo;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestFileOO2 {
	private FileComponent fileOO2;
	private FileDecorator nombreDecorator;
	private FileDecorator extensionDecorator;
	private FileDecorator tamañoDecorator;
	private FileDecorator fechaCreacionDecorator;

	private FileDecorator permisosDecorator;
	private FileDecorator todosDecorators;
	
	@BeforeEach
	void setUp() throws Exception {
		this.fileOO2 = new FileOO2("archivo", ".txt", LocalDate.of(2026, 01, 12), LocalDate.now(), 100, "usuario" );
		this.nombreDecorator = new NombreDecorator(this.fileOO2);
		this.extensionDecorator = new ExtensionDecorator(this.fileOO2); 
		this.tamañoDecorator = new TamañoDecorator(this.fileOO2); 
		this.fechaCreacionDecorator = new FechaCreacionDecorator(this.fileOO2);  
		
		this.permisosDecorator = new PermisosDecorator(this.fileOO2);
		this.todosDecorators = new PermisosDecorator(new FechaCreacionDecorator(new TamañoDecorator(new ExtensionDecorator(new NombreDecorator(fileOO2)))));
	}
	
	@Test
	void testPrettyPrintUnDeco() {
		assertEquals("archivo - .txt",this.extensionDecorator.prettyPrint());
	 
		assertEquals("archivo - 100.0",this.tamañoDecorator.prettyPrint());
	
		assertEquals("archivo - 2025-06-24",this.fechaCreacionDecorator.prettyPrint());


		assertEquals("archivo - usuario",this.permisosDecorator.prettyPrint());
	}
	
	@Test
	void testPrettyPrintTodos() {
		assertEquals("archivo - archivo - .txt - 100.0 - 2025-06-24 - usuario", this.todosDecorators.prettyPrint());
	}


}
