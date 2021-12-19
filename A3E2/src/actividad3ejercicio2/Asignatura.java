package actividad3ejercicio2;

import java.util.*;

public class Asignatura {

	List<Examen> examenes;
	List<Actividad> actividades;
	List<Estudiante> estudiantes;
	private int numExamen;

	public String buscarExamen(int numPreguntas, double tiempo) {
		String resultado= "No encontrado";
		TipoExamen tipoExamen;
		if (numPreguntas<=5) {
			tipoExamen= TipoExamen.A;
		}else if (numPreguntas<=10) {
			tipoExamen= TipoExamen.B;
		}else {
			tipoExamen= TipoExamen.C;
		}
		int numExam=this.getNumExamen();
		boolean finalizar= false; 
		for (int i = 0; i < numExam; i++) {
			Examen examen= this.examenes.get(i);
			TipoExamen tipo=examen.getTipo();
			if (tipo==tipoExamen) {
				boolean encontrado = examen.buscarExResuelto(tiempo);
				if (encontrado) {
					resultado= examen.getId();
					break;
				}
			}
		}
		return resultado;
	}

	public int getNumExamen() {
		return this.numExamen;
	}

	public void setNumExamen(int numExamen) {
		this.numExamen = numExamen;
	}

	public void crearActividad(TipoActividad tipoActividad) {
		Actividad nuevaActividad= new Actividad();
		
		if (tipoActividad==TipoActividad.A1) {
			nuevaActividad.setTestTotales(5);
		}else if (tipoActividad==TipoActividad.A2) {
			nuevaActividad.setTestTotales(10);
		}else if (tipoActividad==TipoActividad.A3){
			nuevaActividad.setTestTotales(15);
		}
		nuevaActividad.crearTests();
		this.agregarActividad(nuevaActividad);
	}

	private void agregarActividad(Actividad act) {
		throw new UnsupportedOperationException();
	}
}
