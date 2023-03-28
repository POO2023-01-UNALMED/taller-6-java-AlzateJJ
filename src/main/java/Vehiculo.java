package vehiculos;

public class Vehiculo {
    String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    private static int CantidadVehiculos;
    
    private static int Camiones;
    private static int Camionetas;
    private static int Automoviles;
    
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        
        CantidadVehiculos++;

        contarTipos(this);
        
    }
    
    //placa
    
    public void setPlaca(String placa) {
    	this.placa=placa;
    }
    public String getPlaca(){
    	return this.placa;
    }
    
    //puertas
    public void setPuertas(int puertas) {
    	this.puertas=puertas;
    }
    public int getPuertas() {
    	return this.puertas;
    }
    
    //velocidadMaxima
    public void setVelocidadMaxima(int vel) {
    	this.velocidadMaxima=vel;
    }
    public int getVelocidadMaxima() {
    	return velocidadMaxima;
    }
    
    //nombre
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    public String getNombre() {
    	return this.nombre;
    }
    
    //precio
    public void setPrecio(double precio) {
    	this.precio=precio;
    }
    public double getPrecio() {
    	return this.precio;
    }
    
    //peso
    public double getPeso() {
    	return this.peso;
    }
    public void setPeso(double peso) {
    	this.peso=peso;
    }
    
    //traccion
    public void setTraccion(String traccion) {
    	this.traccion=traccion;
    }
    public String getTraccion() {
    	return this.traccion;
    }
    
    //fabricante
    public void setFabricante(Fabricante fabricante) {
    	this.fabricante=fabricante;
    }
    public Fabricante getFabricante() {
    	return this.fabricante;
    }
    
    //CantidadVehiculo
    public void setCantidadVehiculo(int c) {
    	Vehiculo.CantidadVehiculos=c;
    }
    public int getCantidadVehiculo() {
    	return Vehiculo.CantidadVehiculos;
    }
    
    private static void contarTipos(Vehiculo carro) {
    	
    	if(carro.getClass().getName()=="vehiculos.Camion") {
    		Camiones++;
		}else if(carro.getClass().getName()=="vehiculos.Camioneta") {
			Camionetas++;
		}else if (carro.getClass().getName()=="vehiculos.Automovil") {
			Automoviles++;
		}
    }
    
    public static String vehiculosPorTipo() {
    	
    	return "Automoviles: " + Automoviles + "\nCamionetas: " + Camionetas + "\nCamiones: " + Camiones;
    }
    
    
}

