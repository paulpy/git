package beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import dao.CalleDao;
import dao.CalleDaoImp;
import model.Calle;

@ManagedBean
@ViewScoped
public class CalleBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Calle calle;
	// CalleDao calleDao;
	
	@Inject
	CalleDao calleDao;
	
	public void init(){
		this.calle = new Calle();
	}
	
	public Calle getCalle() {
		return calle;
	}

	public void setCalle(Calle calle) {
		this.calle = calle;
	}

	public void insertarCalle(){
		//calleDao = new CalleDaoImp();
		calleDao.insertarCalle(calle);
		System.out.println("Entro al boton");
		FacesContext.getCurrentInstance().addMessage("",
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"La Calle fue agrgada correctamente.",	null));
	}
}
