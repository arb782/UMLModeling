package actividad3ejercicio1;

public class Producto {

	private String nombre;
	private TipoProducto tipo;
	private double precio;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoProducto getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
