package uno.vehiculos;

public abstract class Vehiculo {
	
	private String chofer;
	private int kilometrosRecorridos;
	
	public Vehiculo(String chofer) {
		this.chofer = chofer;
		this.kilometrosRecorridos = 0;
	}
}
