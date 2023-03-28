package vehiculos;

import java.util.ArrayList;

public class Pais {
	protected String nombre;
	int ContadorPais=0;
	private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		listaPaises.add(this);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
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
