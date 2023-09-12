package uno.vehiculos;

public class Autobus extends Vehiculo {
	/*En caso del Autobús, no puede cambiar de chofer si hubiera pasajeros.*/
	
	private Persona [] pasajeros = new Persona[10];
	int cantidadDePasajeros = 0;
	
	/*Constructor con cantidad de asientos*/
	public Autobus(int cantidadDeAsientos) {
		super();
		this.pasajeros = new Persona[cantidadDeAsientos];
	}
	
	/*Constructor con argumentos de chofer y cantidad de asientos*/
	public Autobus(Persona chofer, int cantidadAsientos) {
		super(chofer);
		this.pasajeros = new Persona[cantidadAsientos];
	}
	
	public void subirPasajero(Persona pasajero) {//este metodo genera un error
		if(this.cantidadDePasajeros < pasajeros.length) {
			this.pasajeros[cantidadDePasajeros] = pasajero;
			cantidadDePasajeros++;
		}
	}
	
	public void bajarPasajero() {
		if(this.cantidadDePasajeros > 0) {
			cantidadDePasajeros--;			
		}
	}

	public void cambiarChofer(Persona cbChofer) {
		if(this.cantidadDePasajeros == 0) {
			super.asignarChofer(cbChofer);
		}
	}
}
