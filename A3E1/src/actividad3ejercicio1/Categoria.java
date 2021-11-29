package actividad3ejercicio1;

import java.util.*;

public class Categoria {

	List<Producto> productos;
	private String id;
	private int numProductos;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int establecerOfertas() {
		int numProductos=getNumProductos();
		int productosCambiados=0;
		for (int i = 0; i < numProductos; i++) {
			Producto producto=productos.get(i);
			double precio=producto.getPrecio();
			if (precio<10) {
				producto.setTipo(TipoProducto.OFERTA);
				productosCambiados++;
			}
		}
		return productosCambiados;
	}

	public int getNumProductos() {
		return this.numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
}
