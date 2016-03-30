package ProyectTests.Tests;

public class Producto {

	private String nombre;
	private int precio;
	private int cantidad; // por ahora
	private String publicador;
	
	public Producto(String nNombre, int nPrecio, int nCantidad, String nPublicador)
	{
		this.nombre = nNombre;
		this.precio = nPrecio;
		this.cantidad = nCantidad;
		this.publicador = nPublicador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getPublicador() {
		return publicador;
	}

	public void setPublicador(String publicador) {
		this.publicador = publicador;
	}
	
	
}

