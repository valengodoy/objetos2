package ar.edu.info.unlp.ejercicioDemo;

public class AdapterVideoStream implements Media{
	private VideoStream vs;
	
	

	public AdapterVideoStream(VideoStream vs) {
		super();
		this.vs = vs;
	}



	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.vs.reproduce();
		
	}
	
	
	

}
