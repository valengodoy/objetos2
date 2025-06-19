package ar.edu.unlp.info.oo2.biblioteca;

public class FourGAdapter implements Connection{
	private FourGConnection fourg;

	@Override
	public String sendData(String data, long crc) {
		// TODO Auto-generated method stub
		return fourg.transmit(data, crc);
	}

	@Override
	public String pict() {
	
		return fourg.symb();
	}

}
