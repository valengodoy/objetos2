package ar.edu.info.unlp.ejercicioDemo;

public class AdapterRC4 implements MetodoCifrado {
	private RC4 rc4;
	private String key;
	
	

	public AdapterRC4(RC4 rc4, String key) {

		this.rc4 = rc4;
		this.key = key;
	}

	@Override
	public String cifrar(String mensaje) {
		// TODO Auto-generated method stub
		return rc4.encriptar(mensaje, key);
	}

	@Override
	public String descifrar(String mensaje) {
		// TODO Auto-generated method stub
		return rc4.desencriptar(mensaje, key);
	}
	
	

}
