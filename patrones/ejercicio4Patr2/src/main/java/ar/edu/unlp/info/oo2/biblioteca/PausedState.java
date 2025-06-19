package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;
import java.time.LocalDate;

public class PausedState extends State{

	public PausedState(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void togglePause() {
		item.setState(new InProgressState(item));
		
	}

	@Override
	public Duration workedTime() {
		// TODO Auto-generated method stub
		return Duration.between(item.getInicio(), LocalDate.now());
	}

	
}
