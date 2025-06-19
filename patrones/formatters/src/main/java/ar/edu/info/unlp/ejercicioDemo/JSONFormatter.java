package ar.edu.info.unlp.ejercicioDemo;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		 return String.format("{ \"message\": \"%s\", \"level\": \"%s\" }\n",
		            record.getMessage(),  record.getLevel().getName().toLowerCase());
	}

}
