package ProyectTests.Tests;

public class Datos {

	public static boolean validarTamanio(int min, String f, int max)
	{
		if(f.length()<=max && f.length()>=min)
		{
			return true;
		}
		return false;
	}

	
	public static boolean validarLetras(String d)
	{	
		if ((d).matches("([a-z]|[A-Z]|\\s)+"))
		{ 
			return true;
		} 
		return false;
	}

	public static boolean validarNumeros(String d)
	{
		if((d).matches("([0-9]|\\-)+"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static boolean verificarCorreo(String correo) 
	{
		if (correo.indexOf("@") ==1   && correo.indexOf(".") ==1 ) {
			return true;
		}
		return false;
	}


}

