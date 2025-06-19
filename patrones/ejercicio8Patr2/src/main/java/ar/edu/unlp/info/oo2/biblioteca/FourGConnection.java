package ar.edu.unlp.info.oo2.biblioteca;

public class FourGConnection {
	private String symb;
	
	
	public String transmit(String data, long crc) {
		return "4G: " + data + " " + crc;
	}
	
	public String symb() {
		return this.symb;
	}

}
