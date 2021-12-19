package actividad3ejercicio3;

import java.util.*;

public class Caja {

	List<Producto> listaProductos;
	private int numProductos;

	public int getNumProductos() {
		return this.numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}

	public double calcularPrecio(TipoUsuario tipo) {
		double precio = -1;
		
		int nProductos = getNumProductos();
		for (int i = 0; i < nProductos; i++) {
			
			Producto p = listaProductos.get(i);
			double precioProducto = p.getPrecio();
			
			TipoProducto tp = p.getTipoProducto();
			if (tp == TipoProducto.PESADO) {
				double peso = p.getPeso();
				if (peso > 10) {
					precioProducto = precioProducto * 2;
				}
			}
			
			precio += precioProducto;
		}
		
		if (nProductos > 10) {
			precio = precio + 15;
		}
		
		if (tipo == TipoUsuario.VIP) {
			precio = precio * 0.9;
		}
		
		return precio;

	}
}
