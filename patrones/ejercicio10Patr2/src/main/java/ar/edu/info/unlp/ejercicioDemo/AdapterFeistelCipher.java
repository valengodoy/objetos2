package ar.edu.info.unlp.ejercicioDemo;

public class AdapterFeistelCipher implements MetodoCifrado{
	private FeistelCipher feistelCipher;
	
	

	public AdapterFeistelCipher(FeistelCipher feistelCipher) {

		this.feistelCipher = feistelCipher;
	}

	@Override
	public String cifrar(String mensaje) {
		return feistelCipher.encode(mensaje);
		
	}

	@Override
	public String descifrar(String mensaje) {
		return feistelCipher.encode(mensaje);
	}

}
