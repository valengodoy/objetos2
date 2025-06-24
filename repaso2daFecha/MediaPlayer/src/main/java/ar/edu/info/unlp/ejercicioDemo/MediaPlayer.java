package ar.edu.info.unlp.ejercicioDemo;
import java.util.*;

public class MediaPlayer {
	private List<Media> reprod;

	public MediaPlayer() {
		this.reprod = new ArrayList<>();
	}
	
	
	public void addMedia(Media m) {
		this.reprod.add(m);
	}
	
	
	public void play() {
		this.reprod.stream().forEach(m -> m.play());
	}
}
