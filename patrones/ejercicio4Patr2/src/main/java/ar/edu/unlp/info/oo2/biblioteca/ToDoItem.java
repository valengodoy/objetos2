package ar.edu.unlp.info.oo2.biblioteca;

import java.util.*;
import java.time.*;

public class ToDoItem {
	private State state;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String name;
	private List<String> comments;

	public ToDoItem(String name) {
		this.state = new PendingState(this);
		this.name = name;
	}
	
	public void start() {
		this.state.start();
	}
	
	public void togglePause() {
		this.state.togglePause();
	}
	
	public void finish() {
		this.state.finish();
	}
	
	public Duration workedTime() {
		return this.state.workedTime();
	}
	
	public List<String> getComments(){
		return this.comments;
	}
	
	public LocalDate getInicio() {
		return this.fechaInicio;
	}
	
	public LocalDate getFin() {
		return this.fechaFin;
	}
	
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void addComent(String comment) {
		this.state.addComment(comment);
	}
}

