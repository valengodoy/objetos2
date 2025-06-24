package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SandwichTest {
	private DirectorSandwich director;

	@BeforeEach
	public void setUp() {
		director = new DirectorSandwich();
	}

	@Test
	public void testClasico() {
		Sandwich sandwich = director.build(new ClasicoBuilder());
		assertEquals(500.0, sandwich.calcularTotal());
	}

	@Test
	public void testVegetariano() {
		Sandwich sandwich = director.build(new VegetarianoBuilder());
		assertEquals(420.0, sandwich.calcularTotal());
	}

	@Test
	public void testVegano() {
		Sandwich sandwich = director.build(new VeganoBuilder());
		assertEquals(620.0, sandwich.calcularTotal());
	}

	@Test
	public void testSinTacc() {
		Sandwich sandwich = director.build(new SinTaccBuilder());
		assertEquals(618.0, sandwich.calcularTotal());
	}
}


	