package vehiculos;

public class Camion extends Vehiculo{
	
private int ejes;
	
    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante, int ejes)
    {
    	super(placa, 2, 80, nombre, precio, peso, "4x2", fabricante);
    	
    	this.ejes=ejes;
    }


	public void setEjes(int ejes) {
		this.ejes=ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
		

}
