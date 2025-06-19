package ar.edu.unlp.info.oo2.biblioteca;

public interface Connection {
	String sendData(String data, long crc);
	String pict();
}
