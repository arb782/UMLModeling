package actividad3ejercicio2;

import java.util.*;

public class ActividadResuelta {

	Actividad actividad;
	List<EjActividadResuelta> ejResueltos;
	private int numEjercicios;

	public int getNumEjercicios() {
		return this.numEjercicios;
	}

	public void setNumEjercicios(int numEjercicios) {
		this.numEjercicios = numEjercicios;
	}

	public int contarEjercicios(double nota) {
		int numEjercicios= this.getNumEjercicios();
		int ejSuperados=0;
		
		for (int i = 0; i < numEjercicios; i++) {
			EjActividadResuelta ejercicio= ejResueltos.get(i);
			double notaEj=ejercicio.getNotaObtenida();
			
			if (notaEj>8) {
				ejSuperados+=1;	
			}
		}
		return ejSuperados;
	}
}
