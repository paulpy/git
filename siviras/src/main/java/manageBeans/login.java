package manageBeans;

import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

@ManagedBean
public class login implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usuario;
	private String pass;
	private boolean logeado = false;
	private boolean estaLogueado() {
		return logeado;
	}
	public String getUsuario() {
		return usuario;
	}	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void ingreso(ActionListener actionListener) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage mensaje = null;

		if (usuario != null && usuario.equals("admin") && pass != null && pass.equals("admin")) {
			logeado = true;
			mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", usuario);

		} else {
			logeado = false;
			mensaje = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de ingreso", "Credenciale s Invalidas");
		}
		FacesContext.getCurrentInstance().addMessage(null, mensaje);
		context.addCallbackParam("logeado", logeado);
		if (logeado)
			context.addCallbackParam("view", "/protected/main.xhtml");
	}
	//FacesContext.getCurrentInstance().addMessage(null,msg);
	//context.addCallbackParam("estaLogeado",logeado);

	public void logout(){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
		.getExternalContext().getSession(false);
		session.invalidate();
		logeado = false;
	}
}
