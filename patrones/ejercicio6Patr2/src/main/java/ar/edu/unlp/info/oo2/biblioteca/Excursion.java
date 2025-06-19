package ar.edu.unlp.info.oo2.biblioteca;

import java.time.*;
import java.util.*;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> inscriptos;
	private State estado;
	private List<Usuario> listaDeEspera;
	
	
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<>();
		this.listaDeEspera = new ArrayList<>();
		this.estado = new ProvisoriaState();
	}


	public void inscribirUsuario(Usuario usuario) {
		this.estado.inscribirUsuario(this, usuario);
	}
	
	public String obtenerInfo() {
		return this.estado.obtenerInfromacion(this, inscriptos);
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public LocalDate getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}



	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}



	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}



	public double getCosto() {
		return costo;
	}



	public void setCosto(double costo) {
		this.costo = costo;
	}



	public int getCupoMinimo() {
		return cupoMinimo;
	}


	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}


	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}



	public State getEstado() {
		return estado;
	}



	public void setEstado(State estado) {
		this.estado = estado;
	}



	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}



	
	
	
	
	
	
	

	
	
}
