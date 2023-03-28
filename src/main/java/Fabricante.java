package vehiculos;
import java.util.*;  

public class Fabricante {
private String nombre;
private Pais pais;

//Se debe declarar la lista de fabricantes como estática para poder acceder a ella desde el método fabricaMayorVentas
private static List<String> listaFabricantes = new ArrayList<>();

public Fabricante(String nombre, Pais pais) {
	this.nombre=nombre;
	this.pais=pais;
	
	listaFabricantes.add(nombre);
}


//nombre
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getNombre() {
	return this.nombre;
}

//pais
public void setPais(Pais pais) {
	this.pais=pais;
}
public Pais getPais() {
	return this.pais;
}

//Se debe modificar el método para que encuentre el fabricante que más se repite en la lista de fabricantes
public static String fabricaMayorVentas() {
	Map<String, Integer> fabricantes = new HashMap<>();
	
	//Se cuenta la cantidad de veces que aparece cada fabricante en la lista
	for (String fabricante : listaFabricantes) {
		if (fabricantes.containsKey(fabricante)) {
			fabricantes.put(fabricante, fabricantes.get(fabricante) + 1);
		} else {
			fabricantes.put(fabricante, 1);
		}
	}
	
	//Se busca el fabricante con la mayor cantidad de repeticiones
	String fabricanteMayorVentas = "";
	int cantidadMayorVentas = 0;
	
	for (Map.Entry<String, Integer> entry : fabricantes.entrySet()) {
		if (entry.getValue() > cantidadMayorVentas) {
			cantidadMayorVentas = entry.getValue();
			fabricanteMayorVentas = entry.getKey();
		}
	}
	
	return fabricanteMayorVentas;
}

	
}
