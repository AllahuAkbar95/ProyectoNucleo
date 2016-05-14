package conexion;

import java.sql.DriverManager;
import java.sql.ResultSet; // para pruebas
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import ProyectTests.Tests.Campesino; //para pruebas
import ProyectTests.Tests.Persona;
import ProyectTests.Tests.Producto;


public class ConexionSQL {
	private java.sql.Connection co;
	private java.sql.Statement st;
	private java.sql.PreparedStatement prepStat;
	
	public void prepararSQL()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			co = DriverManager.getConnection("jdbc:mysql://proyectoNucleo.heliohost.org/proyecto_nucleo?user=proyecto_usuario&password=usuario123");
			st = co.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}
	
	public boolean insertarUsuario(Persona usuario)
	{

		try {
			prepararSQL();
			prepStat = co.prepareStatement("INSERT INTO usuarios (idUsuario,nombreUsuario,telefono1Usuario,telefono2Usuario,usuarioUsuario,contraseniaUsuario,correoUsuario,direccionUsuario,tipoUsuario)"+"values(?,?,?,?,?,?,?,?,?)");
			
			prepStat.setString(1,usuario.getDocumento());
			prepStat.setString(2,usuario.getNombre());
			prepStat.setString(3,usuario.getTel1());
			prepStat.setString(4,usuario.getTel2());
			prepStat.setString(5,usuario.getUsuario());
			prepStat.setString(6,usuario.getContrasenia());
			prepStat.setString(7,usuario.getCorreo());
			prepStat.setString(8,usuario.getDireccion());
			prepStat.setString(9,usuario.getTipoUsurio());
			
			prepStat.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			return false;
			//e.printStackTrace();
		} 
	}
	
	public void modificarUsuario(Persona usuario)
	{
		
		try {
			prepararSQL();
			prepStat = co.prepareStatement("UPDATE usuarios SET nombreUsuario = ? , telefono1Usuario = ? , telefono2Usuario = ? , usuarioUsuario = ? , contraseniaUsuario = ? , correoUsuario = ? , direccionUsuario = ? WHERE idUsuario = "+usuario.getDocumento());
			prepStat.setString(1, usuario.getNombre());
			prepStat.setString(2, usuario.getTel1());
			prepStat.setString(3, usuario.getTel2());
			prepStat.setString(4, usuario.getUsuario());
			prepStat.setString(5, usuario.getContrasenia());
			prepStat.setString(6, usuario.getCorreo());
			prepStat.setString(7, usuario.getDireccion());
			
			prepStat.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
	
/*	public void modificarProducto(int idProducto)
	{
		try {
			prepararSQL();
			prepStat = co.prepareStatement("UPDATE PRODUCTOS SET  cantidad = ? WHERE idProducto = "+idProducto);
			prepStat.setString(1, usuario.getNombre());

			
			prepStat.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}*/
	
	public void insertarProducto(Producto producto)
	{
		try {
			prepararSQL();
			prepStat = co.prepareStatement("INSERT INTO productos (nombreProducto,cantidad,publicador,precioProducto) values(?,?,?,?)");
			
			prepStat.setString(1, producto.getNombre());
			prepStat.setInt(2, producto.getCantidad());
			prepStat.setString(3,producto.getPublicador());
			prepStat.setDouble(4, producto.getPrecio());
			
			prepStat.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
	
	public void eliminarProducto(String usuarioCamp, String nombreProd)
	{
		prepararSQL();
		try {
			st.executeUpdate("DELETE FROM productos WHERE nombreProducto = \""+nombreProd+"\" and cantidad = 0 and publicador = \""+usuarioCamp+"\"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Producto> obtenerLista(String tipo,String columna)  
	{
		ResultSet rs;
		Producto producto;
		List<Producto> listaProductos = new LinkedList<Producto>();
			try {
				prepararSQL();
				rs = st.executeQuery("SELECT * FROM productos WHERE "+columna+" = \""+tipo+"\"");
				while(rs.next())
				{
					producto = new Producto(rs.getString(2),rs.getInt(5),rs.getInt(3),rs.getString(4));
					listaProductos.add(producto);
				}
				return listaProductos;		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
				return null;
			}
			
	}
	
	public Persona iniciarUsuario(String usuario, String contrasenia)
	{
		try {
			prepararSQL();
			ResultSet rs = st.executeQuery("SELECT * FROM usuarios WHERE usuarioUsuario = \""+usuario+"\" and contraseniaUsuario = \""+contrasenia+"\"");
			if(rs.next())
			{
				//ResultSet rs2 = st.executeQuery("SELECT * FROM PRODUCTOS WHERE publicador = \""+rs.getString(5)+"\"");
				Persona pers = new Persona(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),obtenerLista(rs.getString(5),"publicador"),rs.getString(9).charAt(0));	
				return pers;
			}else{
				return null;
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			return null;
		}
		
		
	}

}
