package ar.edu.info.unlp.ejercicioDemo;

import java.sql.Date;


public interface IMamifero {
	String getIdentificador();
    void setIdentificador(String id);
    
    String getEspecie();
    void setEspecie(String especie);
    
    Date getFechaNacimiento();
    void setFechaNacimiento(Date fecha);
    
    IMamifero getPadre();
    void setPadre(IMamifero padre);
    
    IMamifero getMadre();
    void setMadre(IMamifero madre);
    
    boolean tieneComoAncestro(IMamifero unMamifero);
}
