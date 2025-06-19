package ar.edu.unlp.info.oo2.biblioteca;

public class AdapterVideoStream extends Media{
	private VideoStream vs;
	
	

	public AdapterVideoStream(VideoStream vs) {
		this.vs = vs;
	}



	@Override
	protected void play() {
		vs.reproduce();	
	}

}
