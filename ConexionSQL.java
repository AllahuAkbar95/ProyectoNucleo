package conexion;

import java.sql.DriverManager;
import java.sql.ResultSet; // para pruebas
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import ProyectTests.Tests.Campesino; //para pruebas
import ProyectTests.Tests.Persona;
import ProyectTests.Tests.Producto;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;

public class ConexionSQL {
	private java.sql.Connection co;
	private java.sql.Statement st;
	private java.sql.PreparedStatement prepStat;
	
	public void prepararSQL()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			co = DriverManager.getConnection("jdbc:mysql://localhost/proyecto?user=root&password=Ang2408DBsql&useSSL=false");
			st = co.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insertarUsuario(Persona usuario,String tipo)
	{

		try {
			prepararSQL();
			prepStat = co.prepareStatement("INSERT INTO "+tipo.toUpperCase()+"S (id"+tipo+",nombre"+tipo+",telefono1"+tipo+",telefono2"+tipo+",usuario"+tipo+",contrasenia"+tipo+",correo"+tipo+",direccion"+tipo+")"+"values(?,?,?,?,?,?,?,?)");
			
			prepStat.setString(1,usuario.getDocumento());
			prepStat.setString(2,usuario.getNombre());
			prepStat.setString(3,usuario.getTel1());
			prepStat.setString(4,usuario.getTel2());
			prepStat.setString(5,usuario.getUsuario());
			prepStat.setString(6,usuario.getContrasenia());
			prepStat.setString(7,usuario.getCorreo());
			prepStat.setString(8,usuario.getDireccion());
			
			prepStat.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			//e.printStackTrace();
		} 
	}
	
	public void modificarUsuario(String tipo,String documento,String nombre, String telefono1, String telefono2, String usuario, String contrasenia, String correo, String direccion)
	{
		
		try {
			prepararSQL();
			prepStat = co.prepareStatement("UPDATE "+tipo.toUpperCase()+"S SET nombre"+tipo+" = ? , telefono1"+tipo+" = ? , telefono2"+tipo+" = ? , usuario"+tipo+" = ? , contrasenia"+tipo+" = ? , correo"+tipo+" = ? , direccion"+tipo+" = ? WHERE id"+tipo+" = "+documento);
			//st.executeQuery("UPDATE "+tipo.toUpperCase()+"S SET nombre"+tipo+" = "+nombre+" , tel1"+tipo+" = "+tel1+" , tel2"+tipo+" = "+tel2+" , usuario"+tipo+" = "+usuario+" , contrasenia"+tipo+" = "+contrasenia+" , correo"+tipo+" = "+correo+" , direccion"+tipo+" = "+direccion+" WHERE id"+tipo+" = "+documento+"");
			prepStat.setString(1, nombre);
			prepStat.setString(2, telefono1);
			prepStat.setString(3, telefono2);
			prepStat.setString(4, usuario);
			prepStat.setString(5, contrasenia);
			prepStat.setString(6, correo);
			prepStat.setString(7, direccion);
			
			int n = prepStat.executeUpdate();
			System.out.println(n);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
	
	public void insertarProducto(Producto producto)
	{
		try {
			prepararSQL();
			prepStat = co.prepareStatement("INSERT INTO PRODUCTOS (nombreProducto,cantidad,publicador,precioProducto) values(?,?,?,?)");
			
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
			st.executeUpdate("DELETE FROM PRODUCTOS WHERE nombreProducto = \""+nombreProd+"\" and cantidad = 0 and publicador = \""+usuarioCamp+"\"");
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
				rs = st.executeQuery("SELECT * FROM PRODUCTOS WHERE "+columna+" = \""+tipo+"\"");
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
	
	public Persona iniciarUsuario(String usuario, String contrasenia,String tipo)
	{
		try {
			prepararSQL();
			ResultSet rs = st.executeQuery("SELECT * FROM "+tipo.toUpperCase()+"S WHERE usuario"+tipo+" = \""+usuario+"\" and contrasenia"+tipo+" = \""+contrasenia+"\"");
			if(rs.next())
			{
				//ResultSet rs2 = st.executeQuery("SELECT * FROM PRODUCTOS WHERE publicador = \""+rs.getString(5)+"\"");
				Persona pers = new Persona(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),obtenerLista(rs.getString(5),"publicador"));
				System.out.println(pers.getUsuario());	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String id = "3333333";
		String nombre = "Alan Brito";
		String tel1 = "7655468";
		String tel2 = null;
		String usuario = "campesino3";
		String contrasen = "vcxz";
		String cor = "algo3@hotmail.com";
		String direc = null;
		List lista = null;
		
		
		Persona cam = new Persona(id,nombre,tel1,tel2,usuario,contrasen,cor,direc,lista);
		
		ConexionSQL conexion = new ConexionSQL();
		conexion.eliminarProducto("Campesino3", "Pan");
		//List<Producto> lista = conexion.obtenerLista("Yuca", "nombreProducto");

	}

}
