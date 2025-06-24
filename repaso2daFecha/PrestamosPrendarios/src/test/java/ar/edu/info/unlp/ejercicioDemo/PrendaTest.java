package ar.edu.info.unlp.ejercicioDemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.*;

public class PrendaTest {
	private Alquileres alquiler;
	private Auto auto;
	private Combinada combinada;

	@BeforeEach
	void setUp() {
		combinada = new Combinada();
		alquiler = new Alquileres("Calle 1", 100, 1000);
		auto = new Auto(2020, 50000, 20000);
	}

	@Test
	void testValorPrendarioAlquiler() {
		assertEquals(90000, alquiler.getValorPrendario(), 0.01);
		
	}
	
	@Test
	void testValorPrendarioAuto() {
		assertTrue(auto.getValorPrendario() > 0);
	}
	
	@Test
	void testValorPrendarioCombinada() {
		combinada.addPrenda(alquiler);
		combinada.addPrenda(auto);
		assertEquals(110000, combinada.getValor(), 0.01);
		assertEquals(55000, combinada.getValorPrendario(), 0.01);
		
	}

}
