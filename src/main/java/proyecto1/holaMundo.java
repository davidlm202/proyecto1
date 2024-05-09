package proyecto1;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class holaMundo {
	
	private String mensaje="Hola Mundo";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
