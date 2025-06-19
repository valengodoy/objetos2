package ar.edu.info.unlp.ejercicioDemo;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class UpperCaseFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return super.formatMessage(record).toUpperCase();
	}

}
