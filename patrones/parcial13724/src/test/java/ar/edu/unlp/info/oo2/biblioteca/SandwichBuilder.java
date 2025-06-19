package ar.edu.unlp.info.oo2.biblioteca;

public interface  SandwichBuilder {
	
    void reset();
    void setPan();
    void setAderezo();
    void setPrincipal();
    void setAdicional();
    Sandwich getSandwich();

}
