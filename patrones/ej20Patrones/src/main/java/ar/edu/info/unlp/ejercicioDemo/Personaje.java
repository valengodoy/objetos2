package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class Personaje {
	private String nombre;
	private int vida = 100;
	private Armadura armadura;
	private Arma arma;
	private List<String>habilidades;
	
	public boolean estaVivo() {
		return this.vida > 0;
	}
	
	public void luchar(Personaje rival) {
		if(this.estaVivo() && rival.estaVivo()) {
			rival.recibirDaño(this.arma);
			if(rival.estaVivo()) {
				this.recibirDaño(rival.getArma());
			}
		}
		else throw new RuntimeException("El personajeno esta vivo, no puede luchar");
		
	}
	
	
	public void recibirDaño(Arma arma) {
		int daño = this.armadura.recibirDaño(arma);
		this.vida = Math.max(this.vida - daño, 0);
	}
	
	public Arma getArma() {
		return arma;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	
	
	
}
