package uno.vehiculos;

public abstract class Vehiculo {
	
	/*Atributos*/
	private Persona chofer;
	private int kilometros = 0;
	
	/*Constructor*/
	public Vehiculo(Persona chofer) {
		this.chofer = chofer;
	}
	
	public Vehiculo() {
		/*Constructor sin argumentos*/
	}
	
	/*Metodos*/
	public void asignarChofer(Persona nuevoChofer) {
		this.chofer = nuevoChofer;
	}
	
	public Persona getChofer() {
		return this.chofer;
	}

	public int getKilometros() {
		return this.kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	/*metodo que forzosamente tiene que estar incluido en las subclases*/
	public abstract void cambiarChofer(Persona cbChofer);
}
