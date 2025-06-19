package ar.edu.info.unlp.ejercicioDemo;

public class LightMix extends ProcessStep{

	@Override
	/*protected boolean basicExecute(MixingTank tank) {
		  return tank.heatPower(20) && tank.mixerPower(5);
	} */
	
	
	protected boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature();
		 tank.heatPower(100);
		 tank.delay(2);
		if(tank.temperature() -temp == 10 ){
			tank.mixerPower(5);
			return true;
		}
		else {
			return false;
		 }

	}

}
