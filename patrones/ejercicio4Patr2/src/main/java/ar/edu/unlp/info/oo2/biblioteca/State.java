package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;

public abstract class State {
	protected ToDoItem item;
	
	public State(ToDoItem item) {
		this.item = item;
	}
	
	
	public ToDoItem getToDoItem() {
		return this.item;
	}
	
	
	
	public void start() {};
	public abstract void togglePause();
	public void finish() {};
	public abstract Duration workedTime();
	
	public void addComment(String comment) {
		this.item.getComments().add(comment);
	};
	
}
