package actividad2ejercicio5;

import java.util.*;

public class Edificio {

	private int numPlantas;
	private int numDispositivos;
	private int numUsuarios;

	Collection<Planta> plantas;
	Collection<Dispositivo> dispositivos;
	Collection<Usuario> usuarios;

	public int getNumPlantas() {
		return this.numPlantas;
	}

	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}

	public int getNumDispositivos() {
		return this.numDispositivos;
	}

	public void setNumDispositivos(int numDispositivos) {
		this.numDispositivos = numDispositivos;
	}

	public int getNumUsuarios() {
		return this.numUsuarios;
	}

	public void setNumUsuarios(int numUsuarios) {
		this.numUsuarios = numUsuarios;
	}

	public String listarDispositivos() {
		throw new UnsupportedOperationException();
	}
}
