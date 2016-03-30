package Nucleo;

public class Datos {

	// Validacion de tamaño - MADE BY JM5 © ================
	public static boolean validarTamaño(int min, String f, int max){
		if(f.length()<=max && f.length()>=min){
			if(this.validarCaracteres(f)==true){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	
	// Validacion de caracteres - MADE BY JM5 © ================
	public int validarLetras(String d){
		short c=0;
		if ((d).matches("([a-z]|[A-Z]|\\s)+")){ 
			c=1;
		} else{
			c=0;
		}
		return c;
	}

	public int validarNumeros(String d){
		short c=0;
		if((d).matches("([0-9]|\\-)+")){
			c=0;
		}else{
			c=1;
		}
		return c;
	}

	public boolean validarCaracteres(String d){
		boolean f=false;
		if(this.validarLetras(d)==1 && this.validarNumeros(d)==1){
			f=true;
		}else{
			return f;
		}
		return f;
	}
	
	//==========================================================

	// Validacion de correo - MADE BY BERMUDEZ © ===============

	public static boolean verificarCorreo(String correo) {
		boolean v = false;
		if ((correo.indexOf("@") != -1) && (correo.indexOf(".") != -1)) {
			v = true;
		}
		return v;
	}

}

