package uno.vehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiculosTest {
	
//	@Test
//	public void asignarChoferTest() {
//		Persona Pedro = new Persona();
//		Motocicleta moto1 = new Motocicleta();
//		moto1.asignarChofer(Pedro);
//		assertEquals(Pedro, moto1.getChofer());
//	}
//	
//	@Test
//	public void cambiarChoferSiNoHayAcompTest() {
//		Persona Pedro = new Persona();
//		Persona nuevoChofer = new Persona();
//		//Persona acompa = new Persona();
//		Motocicleta moto1 = new Motocicleta();
//		//moto1.agregarAcompaniante(acompa);
//		moto1.asignarChofer(Pedro);
//		moto1.cambiarChofer(nuevoChofer);
//		assertEquals(nuevoChofer, moto1.getChofer());
//	}
	
	@Test
	public void crearMoto() {
		Persona cacho = new Persona();
		Motocicleta miMoto = new Motocicleta();
		assertEquals(0, miMoto.getKilometros());
		assertEquals(null, miMoto.getChofer());
		miMoto.asignarChofer(cacho);
		assertEquals(cacho, miMoto.getChofer());
	}
	
	@Test
	public void cambiarChoferSiNoHayAcomp() {
		/*Creacion de dos choferes*/
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		
		/*Creacion del acompañante*/
		Persona liz = new Persona();
		
		/*Creacion de la moto con chofer*/
		Motocicleta miMoto = new Motocicleta(cacho);
		
		/*Usando metodo para asignar chofer*/
		//miMoto.asignarChofer(cacho);
		
		/*Usando metodos*/
		miMoto.subirAcompaniante(liz);
		miMoto.cambiarChofer(pepe);
		
		/*Test deberia de tener el chofer cacho*/
		assertEquals(cacho, miMoto.getChofer());
		
		/*Usando metodos*/
		miMoto.bajarAcompaniante();
		miMoto.cambiarChofer(pepe);
		
		/*Test deberia de cambiar de chofer si no hay acompaniante*/
		assertEquals(pepe, miMoto.getChofer());
	}
	
	@Test
	public void cambiarChoferConAcompanianteMoto() {
		/*Creacion de dos choferes*/
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		
		/*Creacion del acompañante*/
		Persona liz = new Persona();
		
		/*Creacion de la moto tipo Vehiculo con chofer y Casteo del tipo*/
		Vehiculo miMoto = new Motocicleta(cacho);
		Motocicleta otraMoto = (Motocicleta)miMoto;
		
		/*Usando metodo para subir un acompaniante*/
		otraMoto.subirAcompaniante(liz);
		
		/*Test deberia de tener acompaniante liz*/
		assertEquals(liz, otraMoto.getAcompaniante());
		
		/*Usando metodo para cambiar de chofer*/
		miMoto.cambiarChofer(pepe);
		
		/*Test deberia de tener el chofer cacho*/
		assertEquals(cacho, miMoto.getChofer());
	}
	
	@Test
	public void vehiculoTest() {
		/*Creacion de chofer*/
		Persona cacho = new Persona();
		
		/*Creacion de tipo Vehiculo*/
		Vehiculo miMoto = new Motocicleta();
		
		/*Test deberia de tener cero km*/
		assertEquals(0, miMoto.getKilometros());
		
		/*Test deberia no tener chofer*/
		assertEquals(null, miMoto.getChofer());
		
		/*Metodo para asignar chofer cacho*/
		miMoto.asignarChofer(cacho);
		
		/*Test deberia de tener el chofer cacho*/
		assertEquals(cacho, miMoto.getChofer());
	}
	
	@Test
	public void cambiarChoferSinAcompanianteBondi() {
		/*Creacion de choferes*/
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		
		/*Creacion de acompaniante*/
		Persona liz = new Persona();
		
		/*Creacion de tipo Autobus*/
		Autobus miBondi = new Autobus(cacho, 10);
		
		/*Metodos subir pasajero liz y cambiar chofer*/
		miBondi.subirPasajero(liz);
		miBondi.cambiarChofer(pepe);
		
		/*Test deberia de tener como chofer a cacho*/
		assertEquals(cacho, miBondi.getChofer());
		
		/*Metodo para bajar pasajero y cambiar chofer*/
		miBondi.bajarPasajero();
		miBondi.cambiarChofer(pepe);
		
		/*Test deberia de tener como chofer a pepe*/
		assertEquals(pepe, miBondi.getChofer());
	}

}
