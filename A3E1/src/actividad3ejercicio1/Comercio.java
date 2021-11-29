package actividad3ejercicio1;

import java.util.*;

public class Comercio {

	List<Categoria> categorias;
	private int numCategorias;

	public int establecerOfertas(String id) {
		int numCategorias=getNumCategorias();
		int productosCambiados=0;
		for(int i=0; i<numCategorias;i++) {
			Categoria cat=categorias.get(i);
			String idCategoria=cat.getId();
			if (id.equals(idCategoria)) {
				productosCambiados=cat.establecerOfertas();
			}
		}
		return productosCambiados;
	}

	public int getNumCategorias() {
		return this.numCategorias;
	}

	public void setNumCategorias(int numCategorias) {
		this.numCategorias = numCategorias;
	}
}
