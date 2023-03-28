package vehiculos;

import java.util.*;

public class Pais {
    
	int ContadorPais=0;
	
    private String nombre;
    private static List<Pais> listaPaises = new ArrayList<>();
    
    public Pais(String nombre) {
        this.nombre = nombre;
        listaPaises.add(this);
    }
    
    //Nombre 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public static Pais paisMasVendedor() {
		int cont=0;
		Pais masVendedor=null;
		for(Pais i:listaPaises) {
			if(i.ContadorPais > cont) {
				cont=i.ContadorPais;
				masVendedor=i;
			}	
		}
		return  masVendedor;
	}

}
