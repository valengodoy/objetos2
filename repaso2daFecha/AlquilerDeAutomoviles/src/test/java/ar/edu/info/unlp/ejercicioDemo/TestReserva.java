package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestReserva {

	private AutoEnAlquiler auto;
	private Usuario conductor;
	private Reserva reserva;
	private Moderada moderada;

	@BeforeEach
	public void setUp() {
		moderada = new Moderada();
		auto = new AutoEnAlquiler(10, 2, "Fiat", moderada);
		conductor = new Usuario("Pepe");
		reserva = new Reserva(2, auto, conductor);	
	}

	@Test
	public void testMontoAPagar() {
		assertEquals(reserva.montoAPagar(), 20);
	}

	@Test
	public void testMontoAReembolsar() {
		assertEquals(reserva.montoAReembolsar(), 0);
	}





	
}


	