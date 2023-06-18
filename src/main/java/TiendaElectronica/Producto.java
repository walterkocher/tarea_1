package TiendaElectronica;

public class Producto {
	private String nombre;
	private String descripcion;
	private int precio;
	private int stock;
	private String categoria;

	public Producto(String nombre, String descripcion, int precio, int stock, String categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}
	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return getNombre()+" "+getDescripcion()+" "+getPrecio()+" "+getStock()+" "+getCategoria();
	}
}
