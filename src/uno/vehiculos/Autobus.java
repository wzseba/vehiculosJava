package uno.vehiculos;

public class Autobus extends Vehiculo {
	
	private Persona [] pasajeros;
	private int cantidadAsientos = 0;
	
	public Autobus() {
		super();
	}
	
	public void subirPasajero(Persona pasajero) {
		if(this.cantidadAsientos <= 10) {
			pasajeros[cantidadAsientos] = pasajero;
			cantidadAsientos++;
		}
	}

	public void cambiarChofer(Persona cbChofer) {
		
	}
}
