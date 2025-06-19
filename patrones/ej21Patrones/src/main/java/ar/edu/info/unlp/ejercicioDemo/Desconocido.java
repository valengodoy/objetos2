package ar.edu.info.unlp.ejercicioDemo;

import java.sql.Date;

public class Desconocido implements IMamifero{

	@Override
	public String getIdentificador() {
		return "Desconocido";
	}

	@Override
	public void setIdentificador(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecie() {
		
		return "Desconocido";
	}

	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFechaNacimiento(Date fecha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getPadre() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setPadre(IMamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getMadre() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setMadre(IMamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tieneComoAncestro(IMamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}
