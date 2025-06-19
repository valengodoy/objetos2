package ar.edu.info.unlp.ejercicioDemo;

public class MixingTank {
	private boolean heatPowerResult = true;
	private boolean mixerPowerResult = true;
	private boolean purgeResult = true;
	
	
	public void setHeatPower(boolean result) {
		this.heatPowerResult = result;
	}
	
	public void setMixerPower(boolean result) {
		this.mixerPowerResult = result;
	}
	
	public void setPurgeResult(boolean result) {
		this.purgeResult = result;
	}
	
	
	public boolean mixerPower(int percentage) {
		return mixerPowerResult;
	}
	
	
	public boolean heatPower(int percentage) {
		return heatPowerResult;
	}
	
	public boolean purge() {
		return purgeResult;
	}
	
	 public double temperature() {
	        return 0; // Método nuevo: deberías agregarlo si no existe
	    }

	    public int upTo() {
	        return 0; // Método nuevo: lo mismo
	    }
}
