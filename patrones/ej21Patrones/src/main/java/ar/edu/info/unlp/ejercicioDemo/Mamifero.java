package ar.edu.info.unlp.ejercicioDemo;

import java.sql.Date;

public class Mamifero implements IMamifero{

	@Override
	public String getIdentificador() {
		return this.getIdentificador();
	}

	@Override
	public void setIdentificador(String id) {
		this.setIdentificador(id);
		
	}

	@Override
	public String getEspecie() {
		return this.getEspecie();
	}

	@Override
	public void setEspecie(String especie) {
		this.setEspecie(especie);
	}

	@Override
	public Date getFechaNacimiento() {
		return this.getFechaNacimiento();
	}

	@Override
	public void setFechaNacimiento(Date fecha) {
		this.setFechaNacimiento(fecha);
		
	}

	@Override
	public IMamifero getPadre() {
		return this.getPadre();
	}

	@Override
	public void setPadre(IMamifero padre) {
		this.setPadre(padre);
		
	}

	@Override
	public IMamifero getMadre() {
		return this.getMadre();
	}

	@Override
	public void setMadre(IMamifero madre) {
		this.setMadre(madre);
		
	}

	@Override
	public boolean tieneComoAncestro(IMamifero unMamifero) {
		if(this.getPadre().equals(unMamifero) || this.getMadre().equals(unMamifero)) {
			return true;
		}
		return this.getPadre().tieneComoAncestro(unMamifero) || this.getMadre().tieneComoAncestro(unMamifero);
	}
	
	

}
