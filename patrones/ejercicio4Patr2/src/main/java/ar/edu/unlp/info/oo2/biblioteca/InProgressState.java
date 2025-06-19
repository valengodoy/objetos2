package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;
import java.time.LocalDate;

public class InProgressState extends State{

	public InProgressState(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void togglePause() {
		item.setState(new PausedState(item));
	}

	@Override
	public void finish() {
		item.setState(new FinishedState(item));
		
	}

	@Override
	public Duration workedTime() {
		return Duration.between(item.getInicio(), LocalDate.now());
	}

}