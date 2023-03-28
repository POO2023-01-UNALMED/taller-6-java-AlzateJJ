package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	protected String nombre;
	protected Pais pais;
	int contadorFabrica=0;
	private static ArrayList<Fabricante> listaFabric = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		listaFabric.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	public Pais getPais() {
		return pais;
	}
	public static Fabricante fabricaMayorVentas() {
		int cont=0;
		Fabricante masVendedora=null;
		for(Fabricante i:listaFabric) {
			if(i.contadorFabrica > cont) {
				cont=i.contadorFabrica;
				masVendedora=i;
			}	
		}
		return  masVendedora;
	}
	

}
