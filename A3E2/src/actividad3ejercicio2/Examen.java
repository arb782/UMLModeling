package actividad3ejercicio2;

import java.util.*;

public class Examen {

	Collection<ExamenResuelto> exResueltos;
	private String id;
	private TipoExamen tipo;
	private int numExResueltos;

	public TipoExamen getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoExamen tipo) {
		this.tipo = tipo;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean buscarExResuelto(double tiempo) {
		throw new UnsupportedOperationException();
	}

	public int getNumExResueltos() {
		return this.numExResueltos;
	}

	public void setNumExResueltos(int numExResueltos) {
		this.numExResueltos = numExResueltos;
	}
}
