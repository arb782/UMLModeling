package actividad3ejercicio2;

import java.util.*;

public class Estudiante {

	List<Asignatura> asignaturas;
	List<ExamenResuelto> exResueltos;
	List<ActividadResuelta> actResueltas;
	private int numActividades;

	public int contarEjercicios(double nota) {
		int actividades=getNumActividades();
		int ejercicios=0;
		
		for (int i = 0; i < actividades ; i++) {
			 ActividadResuelta actividad= actResueltas.get(i);
			 ejercicios +=actividad.contarEjercicios(nota);
		}
		return ejercicios;
	}

	public int getNumActividades() {
		return this.numActividades;
	}

	public void setNumActividades(int numActividades) {
		this.numActividades = numActividades;
	}
}
