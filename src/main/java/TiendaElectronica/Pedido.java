package TiendaElectronica;

import java.util.ArrayList;

public class Pedido {
	private String codigoVenta;
	private Cliente cliente;
	private ArrayList<Producto> productos;

	public Pedido(String codigoVenta) {
		this.codigoVenta = codigoVenta;
		this.productos = new ArrayList<>();
	}

	public ArrayList<Producto> getProductos(){
		return productos;
	}

	public void setProductos(ArrayList<Producto>productos) {
		this.productos = productos;
	}

	public void removerProducto(Producto producto) {
		productos.remove(producto);
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
}