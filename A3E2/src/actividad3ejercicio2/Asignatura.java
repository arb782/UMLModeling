package actividad3ejercicio2;

import java.util.*;

public class Asignatura {

	Collection<Examen> examenes;
	Collection<Actividad> actividades;
	Collection<Estudiante> estudiantes;
	private int numExamen;

	public String buscarExamen(int numPreguntas, double tiempo) {
		throw new UnsupportedOperationException();
	}

	public int getNumExamen() {
		return this.numExamen;
	}

	public void setNumExamen(int numExamen) {
		this.numExamen = numExamen;
	}

	public void crearActividad(TipoActividad tipoActividad) {
		throw new UnsupportedOperationException();
	}

	private void agregarActividad(Actividad act) {
		throw new UnsupportedOperationException();
	}
}
