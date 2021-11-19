package actividad2ejercicio5;

public abstract class Dispositivo extends Inventario {

	private String numeroSerie;
	private TipoDispositivo tipo;

	public String getNumeroSerie() {
		return this.numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public TipoDispositivo getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoDispositivo tipo) {
		this.tipo = tipo;
	}
}
