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
	
	public static boolean verificarCorreo(String correo) {
		boolean v = false;
		int c1 = 0, c2 = 0,pos1=0,pos2=0;
		if (correo.indexOf("@") != -1 && correo.indexOf(".") != -1) {

			for (char i = 0; i < correo.length(); i++) {
				char letra = correo.charAt(i);
				if (letra == '@') {
					c1++;
					pos1=i;
				} else if (letra == '.') {
					c2++;
					pos2=i;

				}
			}
			if ((c1 <= 1 && c2 <= 2)&&(pos1<pos2)&&(pos1>1&&pos2>2)) {
				v = true;
			}
		}
		return v;
	}
	

}

