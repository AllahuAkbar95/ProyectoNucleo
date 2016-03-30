package ProyectTests.Tests;

import java.util.List;

public class Campesino extends Persona {
	private List<Producto> notificaciones;

	public Campesino(String nDocumento,String nNombre, String nTel1, String nTel2,  String nUsuario, String nContrasenia,
			String nCorreo, String nDireccion,List<Producto> nLista) {
		super(nDocumento,nNombre, nTel1, nTel2,  nUsuario, nContrasenia, nCorreo, nDireccion,nLista);
		// TODO Auto-generated constructor stub
		this.notificaciones = null;
	}

	public List<Producto> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Producto> notificaciones) {
		this.notificaciones = notificaciones;
	}

}
