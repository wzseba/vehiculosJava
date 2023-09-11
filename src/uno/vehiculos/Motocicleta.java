package uno.vehiculos;

public class Motocicleta extends Vehiculo {
	
	/*Atributos*/
	private Persona acompaniante;
	
	/*Constructor*/
	public Motocicleta() {
		super();
	}

	public void agregarAcompaniante(Persona acomp) {
		this.acompaniante = acomp;
	}

	@Override
	public void cambiarChofer(Persona cbChofer) {
		if(this.acompaniante == null) {
			super.asignarChofer(cbChofer);
		}
	}
}
