package actividad2ejercicio5;

import java.util.*;

public class Planta extends Inventario {

	private int numEspacios;

	Collection<Espacio> espacios;

	public int getNumEspacios() {
		return this.numEspacios;
	}

	public void setNumEspacios(int numEspacios) {
		this.numEspacios = numEspacios;
	}

	public String listarDispositivosPlanta() {
		throw new UnsupportedOperationException();
	}
}
