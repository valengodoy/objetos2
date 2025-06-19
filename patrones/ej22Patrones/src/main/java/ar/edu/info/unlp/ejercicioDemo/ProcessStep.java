package ar.edu.info.unlp.ejercicioDemo;

public abstract class ProcessStep {
	private boolean result;
	
	
	public void execute(MixingTank tank) {
		if(this.basicExecute(tank)) {
			this.setSuccess();
		}
		else this.setFailure();
	}
	
	
	private void setSuccess() {
		this.result = true;
	}
	
	
	private void setFailure() {
		this.result = false;
	}
	
	public boolean isDone() {
		return this.result;
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
}
