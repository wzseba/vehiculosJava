package uno.vehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiculosTest {

	@Test
	public void asignarChoferTest() {
		Persona Pedro = new Persona();
		Motocicleta moto1 = new Motocicleta();
		moto1.asignarChofer(Pedro);
		assertEquals(Pedro, moto1.getChofer());
	}
	
	@Test
	public void cambiarChoferSiNoHayAcompTest() {
		Persona Pedro = new Persona();
		Persona nuevoChofer = new Persona();
		//Persona acompa = new Persona();
		Motocicleta moto1 = new Motocicleta();
		//moto1.agregarAcompaniante(acompa);
		moto1.asignarChofer(Pedro);
		moto1.cambiarChofer(nuevoChofer);
		assertEquals(nuevoChofer, moto1.getChofer());
	}

}
