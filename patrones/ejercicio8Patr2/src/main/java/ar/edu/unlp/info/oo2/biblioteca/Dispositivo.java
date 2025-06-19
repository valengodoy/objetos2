package ar.edu.unlp.info.oo2.biblioteca;

public class Dispositivo {
	private Connection conn;
	private Ringer ringer;
	private Display display;
	private CRC16_Calculator crcCalculator;
	
	public String send(String Data) {
		long crc = this.crcCalculator.crcFor(Data);
		return this.conn.sendData(Data, crc);
	}
	
	
	

}
