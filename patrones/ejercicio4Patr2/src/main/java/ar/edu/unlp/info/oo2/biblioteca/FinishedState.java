package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FinishedState extends State{

	public FinishedState(ToDoItem item) {
		super(item);
		this.item.setFechaFin(LocalDate.now());
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public void togglePause() {
		// TODO Auto-generated method stub
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}



	@Override
	public Duration workedTime() {
		return Duration.between(this.item.getInicio(), this.item.getFin());	
		
	}

	

}
