package ar.edu.unlp.info.oo2.biblioteca;

public class WifiConn implements Connection{
	private String pict;

	@Override
	public String sendData(String data, long crc) {
		// TODO Auto-generated method stub
		return "Wifi: " + data + " " + crc;
	}

	@Override
	public String pict() {
		// TODO Auto-generated method stub
		return this.pict;
	}

}
