package vehiculos;

import java.util.*;

public class Pais {
    
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
    
    public static String paisMasVendedor() {
        Map<String, Integer> paises = new HashMap<String, Integer>();
        for (Pais pais : listaPaises) {
            String nombre = pais.getNombre();
            int count = paises.containsKey(nombre) ? paises.get(nombre) : 0;
            paises.put(nombre, count + 1);
        }

        List<String> maxPaises = new ArrayList<String>();
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : paises.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxPaises.clear();
                maxPaises.add(entry.getKey());
                maxCount = count;
            } else if (count == maxCount) {
                maxPaises.add(entry.getKey());
            }
        }

        return String.join(", ", maxPaises);
    }

}
