package actividad3ejercicio2;

import java.util.*;

public class Actividad {

	List<ActividadResuelta> actResueltas;
	List<Test> tests;
	private double notaMaxima;
	private int testTotales;

	public double getNotaMaxima() {
		return this.notaMaxima;
	}

	public void setNotaMaxima(double notaMaxima) {
		this.notaMaxima = notaMaxima;
	}

	public int getTestTotales() {
		return this.testTotales;
	}

	public void setTestTotales(int testTotales) {
		this.testTotales = testTotales;
	}

	private void agregarTest(Test test) {
		throw new UnsupportedOperationException();
	}

	public void crearTests() {
		for (int i = 0; i < this.testTotales; i++) {
			Test nuevoTest=new Test();
			this.agregarTest(nuevoTest);
		}
	}
}
