package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;

public class PendingState extends State{

	public PendingState(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		item.setState(new InProgressState(item));
	}

	@Override
	public void togglePause() {
		// TODO Auto-generated method stub
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem no se ha iniciado");
	}

	@Override
	public void addComment(String comment) {
		// TODO Auto-generated method stub
		
	}

}
