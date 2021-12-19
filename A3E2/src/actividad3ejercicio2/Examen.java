package actividad3ejercicio2;

import java.util.*;

public class Examen {

	List<ExamenResuelto> exResueltos;
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
		int exResuelto=this.getNumExResueltos();
		for (int i = 0; i < exResuelto; i++) {
			ExamenResuelto examen= exResueltos.get(i);
			double tiempoRes= examen.getTiempoTotal();
			if (tiempoRes<tiempo) {
				return true;
			}
		}
		return false;
	}

	public int getNumExResueltos() {
		return this.numExResueltos;
	}

	public void setNumExResueltos(int numExResueltos) {
		this.numExResueltos = numExResueltos;
	}
}
