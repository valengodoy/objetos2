package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class MediaPlayer {
	private List <Media> media;
	
	public void addMedia(Media media) {
		this.media.add(media);
	}
	
	public void play() {
		this.media.stream().forEach(media -> media.play());
	}
	
	

}
