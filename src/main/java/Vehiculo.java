package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos=0;
	
	public Vehiculo(String placa,int puertas, int velocidadMaxima, String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		CantidadVehiculos++;
		fabricante.pais.ContadorPais++;
		fabricante.contadorFabrica++;
	
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public int getPeso() {
		return peso;
	}
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public static void setCantidadVehiculos(int CantidadVehiculos) {
		Vehiculo.CantidadVehiculos=CantidadVehiculos;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
    public static String vehiculosPorTipo() {
        int cantidadAutomoviles = Automovil.getCantidadVehiculos();
        int cantidadCamionetas = Camioneta.getCantidadVehiculos();
        int cantidadCamiones = Camion.getCantidadVehiculos();
        return String.format("Automoviles: %d\nCamionetas: %d\nCamiones: %d", cantidadAutomoviles, cantidadCamionetas, cantidadCamiones);
    }
} 
