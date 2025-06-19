package ar.edu.info.unlp.ejercicioDemo;


import  org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


public class FileTest {
	private FileOO2 file;
	
	
	@BeforeEach
	void setUp() {
		file = new FileOO2("valentina",".txt","16GB",LocalDate.of(2020, 3, 4),LocalDate.of(2004, 11, 22),"de admin");
		
	}
	
	
	@Test
	void testNombreExtension() {
		FileComponent archivo = new ExtensionDecorador(file);
		assertEquals("valentina.txt",archivo.prettyPrint());
	}
	
	void testFechaPermiso() {
		FileComponent crea = new FechaCreacionDecorador(file);
		FileComponent perm = new PermisosDecorador(crea);
		
		assertEquals("valentina22/11/2004de admin", perm.prettyPrint());
	}

}
