package uno.vehiculos;

public class Motocicleta extends Vehiculo {
	
	/*Atributos*/
	private Persona acompaniante;
	
	/*Constructor*/
	public Motocicleta(Persona chofer) {
		super(chofer);
	}
	
	public Motocicleta() {
		super();
	}

	public void subirAcompaniante(Persona acomp) {
		if(this.acompaniante == null) {
			this.acompaniante = acomp;			
		}
	}

	public void bajarAcompaniante() {
		this.acompaniante = null;
	}
	
	public Persona getAcompaniante() {
		return acompaniante;
	}

	@Override
	public void cambiarChofer(Persona cbChofer) {
		if(this.acompaniante == null) {
			super.asignarChofer(cbChofer);
		}
	}
}
