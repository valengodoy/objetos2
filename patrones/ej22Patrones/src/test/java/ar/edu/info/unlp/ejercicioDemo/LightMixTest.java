package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class LightMixTest  {
	private LightMix lightMix;
	private MixingTank stub;
	
	@BeforeEach
	void setUp() throws Exception{
		lightMix = new LightMix();
		stub = new MixingTank();
				
	}
	
	@Test 
	void testExecute() {
		lightMix.execute(stub);
		assertTrue(lightMix.isDone());
		stub.setHeatPower(true);
		stub.setMixerPower(false);
		lightMix.execute(stub);
		assertFalse(lightMix.isDone());
		stub.setHeatPower(false);
		stub.setMixerPower(true);
		assertFalse(lightMix.isDone());
		stub.setHeatPower(false);
		stub.setMixerPower(false);
		lightMix.execute(stub);
		assertFalse(lightMix.isDone());
	}
	
	
}
