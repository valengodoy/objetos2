package ar.edu.info.unlp.ejercicioDemo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class PurgeTest {
	private Purge purge;
	private MixingTank stub;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		 purge = new Purge();
		 stub = new MixingTank();
	}
	
	
	@Test
	void testExecute() {
		purge.execute(stub);
		assertTrue(purge.isDone());
		
		stub.setHeatPower(true);
		stub.setMixerPower(true);
		stub.setPurgeResult(false);
		purge.execute(stub);
		assertFalse(purge.isDone());
		
		stub.setHeatPower(true);
		stub.setMixerPower(false);
		stub.setPurgeResult(true);
		assertFalse(purge.isDone());
		
		stub.setHeatPower(false);
		stub.setMixerPower(true);
		stub.setPurgeResult(true);
		purge.execute(stub);
		assertFalse(purge.isDone());
		
		
		stub.setHeatPower(true);
		stub.setMixerPower(false);
		stub.setPurgeResult(false);
		purge.execute(stub);
		assertFalse(purge.isDone());
		
		
		stub.setHeatPower(false);
		stub.setMixerPower(false);
		stub.setPurgeResult(true);
		purge.execute(stub);
		assertFalse(purge.isDone());
		
		
		stub.setHeatPower(false);
		stub.setMixerPower(true);
		stub.setPurgeResult(false);
		purge.execute(stub);
		assertFalse(purge.isDone());
		
		stub.setHeatPower(false);
		stub.setMixerPower(false);
		stub.setPurgeResult(false);
		purge.execute(stub);
		assertFalse(purge.isDone());
	}
}
