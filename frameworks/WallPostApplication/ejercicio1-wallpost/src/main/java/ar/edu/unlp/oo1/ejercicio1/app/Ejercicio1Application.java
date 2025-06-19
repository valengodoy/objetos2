package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {
	public static final Logger uiLogger = Logger.getLogger("ar.edu.unlp.oo1.ejercicio1.ui");
static {
	try {
		FileHandler handler = new FileHandler("ui.log", true);
		handler.setFormatter(new SimpleFormatter());
		uiLogger.addHandler(handler);
		uiLogger.setUseParentHandlers(false);
	} catch (IOException e) {
		System.err.println("Error al configurar uiLogger: " + e.getMessage());
	}
}
	
	
	public static void main(String[] args) throws SecurityException, IOException {
		uiLogger.info("arrancando app");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
