package ProyectTests.Tests;

import java.util.List;

public class Campesino extends Persona {
	private List<Producto> notificaciones;

	public Campesino(String nNombre, String nTel1, String nTel2, String nDocumento, String nUsuario, String nContrasenia,
			String nCorreo, String nDireccion) {
		super(nNombre, nTel1, nTel2, nDocumento, nUsuario, nContrasenia, nCorreo, nDireccion);
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
