package TiendaElectronica;

public class RealizarPedido {
	private Pedido pedido;

	public RealizarPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public boolean agregarProducto(Producto producto) {
		if(producto!=null){
			this.pedido.agregarProducto(producto);
			return true;
		}else{
			return false;
		}
	}

	public boolean eliminarProducto(Producto producto) {
		if(producto!=null){
			this.pedido.removerProducto(producto);
			return true;
		}else{
			return false;
		}
	}

	public boolean compra() {
		int nuevoStock;
		for (Producto producto: pedido.getProductos()){
			nuevoStock = producto.getStock()-1;
			producto.setStock(nuevoStock);
		}
		System.out.println("Se ha realizado la compra");
		return true;
	}
}