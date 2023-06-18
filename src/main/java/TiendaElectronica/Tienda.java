package TiendaElectronica;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public boolean agregarProducto(String nombre, String descripcion, int precio, int stock, String categoria) {
		if(buscarProducto(nombre, categoria) == null) {
			Producto producto = new Producto(nombre,descripcion,precio,stock,categoria);
			this.productos.add(producto);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean eliminarProducto(String nombre, String categoria) {
		for(Producto producto : this.productos) {
			if (producto.getNombre().equals(nombre) && producto.getCategoria().equals(categoria)){
				this.productos.remove(producto);
				return true;
			}
		}
		return false;
	}

	public Producto buscarProducto(String nombre, String categoria) {
		for (Producto producto : this.productos) {
			if(producto.getNombre().equals(nombre) && producto.getCategoria().equals(categoria)){
				return producto;
			}

		} return null;
	}

	public boolean modificarInformacion(String nombre, String categoria, int opcion, String atributo) {
		for(Producto producto : this.productos){
			if(producto.getNombre().equals(nombre) && producto.getCategoria().equals(categoria)){
				switch (opcion){
					case 1:
						producto.setNombre(atributo);
						break;
					case 2:
						producto.setDescripcion(atributo);
						break;
					case 3:
						producto.setPrecio(Integer.parseInt(atributo));
						break;

					case 4:
						producto.setStock(Integer.parseInt(atributo));
						break;
					case 5:
						producto.setCategoria(atributo);
						break;
					default:
						return false;
				} return true;
			}else{
				return false;
			}
		}
		return false;
	}

	public void mostrarProducto() {
		for(Producto producto:this.productos){
			System.out.println(producto);
		}
	}
}