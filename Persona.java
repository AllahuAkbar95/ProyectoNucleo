package ProyectTests.Tests;

import java.util.List;

public class Persona {
	protected String nombre;
	protected String tel1;
	protected String tel2;
	protected String documento;
	protected String usuario;
	protected String contrasenia;
	protected String correo;
	protected List<Producto> listaProductos;
	protected String direccion;
	
	
	public Persona(String nDocumento,String nNombre, String nTel1, String nTel2 ,String nUsuario, String nContrasenia, String nCorreo,String nDireccion,List<Producto> nLista)
	{
		this.nombre = nNombre;
		this.tel1 = nTel1;
		this.tel2 = nTel2;
		this.documento = nDocumento;
		this.usuario = nUsuario;
		this.contrasenia = nContrasenia;
		this.correo = nCorreo;
		this.listaProductos = nLista;
		this.direccion = nDireccion;
	}
	
	public void modificar(Persona persona,String nombre, String tel1, String tel2,String usurio, String contrasenia, String correo)
	{
		persona.setNombre(nombre);
		persona.setTel1(tel1);
		persona.setTel2(tel2);
		persona.setUsuario(usurio);
		persona.setContrasenia(contrasenia);
		persona.setCorreo(correo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}

