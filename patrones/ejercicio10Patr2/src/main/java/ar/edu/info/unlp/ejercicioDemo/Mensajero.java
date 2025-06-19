package ar.edu.info.unlp.ejercicioDemo;

public class Mensajero {
	    private MetodoCifrado cifrado;

	    public Mensajero(MetodoCifrado cifrado) {
	        this.cifrado = cifrado;
	    }

	    public void setCifrado(MetodoCifrado nuevoCifrado) {
	        this.cifrado = nuevoCifrado;
	    }

	    public void enviar(String mensaje) {
	        String mensajeCifrado = cifrado.cifrar(mensaje);
	        System.out.println("Enviando mensaje cifrado: " + mensajeCifrado);
	     
	    }

	    public void recibir(String mensajeCifrado) {
	        String mensajeDescifrado = cifrado.descifrar(mensajeCifrado);
	        System.out.println("Mensaje recibido y descifrado: " + mensajeDescifrado);
	    }
}
