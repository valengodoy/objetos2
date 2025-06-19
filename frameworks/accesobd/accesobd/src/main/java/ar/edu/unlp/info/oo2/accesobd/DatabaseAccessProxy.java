package ar.edu.unlp.info.oo2.accesobd;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private DatabaseAccess database;
	private boolean logueado;
	private String key;
	private static final Logger logger = Logger.getLogger(DatabaseAccessProxy.class.getName());
	
	public DatabaseAccessProxy(DatabaseAccess database, String password) {
		this.database = database;
		this.logueado = false;
		this.key = password;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.logueado) {
			logger.log(Level.INFO, "Accceso valido para busquedas");
			return this.database.getSearchResults(queryString);
		}
		else {
			throw new RuntimeException ("El usuario no esta logueado");
		}
		
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.logueado) {
			logger.log(Level.WARNING, "Acceso valido para inserciones a la base de datos");
			return this.database.insertNewRow(rowData);
		}
		else {
			throw new RuntimeException ("El usuario no esta logueado");
		}
	}
	
	public void login(String password){
		if(!this.logueado) {
			if(this.key.equals(password)) {
				this.logueado = true;
			}
			else {
				throw new RuntimeException ("Contraseña invalida");
			}
		}
		else {
			throw new RuntimeException ("Ya se encuentra logueado");
			
		}		
	}
	
	public void logout() {
		if(this.logueado) {
			this.logueado=false;
		}
		else {
			throw new RuntimeException ("No tiene una sesion iniciada");
		}
	}
	
	
}
