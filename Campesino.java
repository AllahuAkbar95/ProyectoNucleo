package ProyectTests.Tests;

import java.util.List;

public class Campesino extends Persona {
	public Campesino(String nDocumento, String nNombre, String nTel1, String nTel2, String nUsuario,
			String nContrasenia, String nCorreo, String nDireccion, List<Producto> nLista, char nTipoUsuario) {
		super(nDocumento, nNombre, nTel1, nTel2, nUsuario, nContrasenia, nCorreo, nDireccion, nLista, nTipoUsuario);
		// TODO Auto-generated constructor stub
	}

	private List<Producto> notificaciones;

	

	public List<Producto> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Producto> notificaciones) {
		this.notificaciones = notificaciones;
	}
}
