package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler{
	private Handler siguiente;
	private List<String> ocultas;
	
	

	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub
		String message = record.getMessage();
		for(String p: ocultas) {
			message = message.replaceAll(p, "***");
		}
		
	}

	@Override
	public void flush() {
		siguiente.flush();
	}

	@Override
	public void close() {
		siguiente.close();
		
	}

}
