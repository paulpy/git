/**
 * 
 */
package manageBeans;

/**
 * @author paulj
 *
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
import org.primefaces.context.RequestContext;
 
@ManagedBean
public class UserLoginView {     
    private String username;     
    private String password; 
    public String getUsername() {
        return username;
    } 
    public void setUsername(String username) {
        this.username = username;
    } 
    public String getPassword() {
        return password;
    } 
    public void setPassword(String password) {
        this.password = password;
    }   
    public void login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;         
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", username);
            System.out.println("paso por aqui");
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de logueo", "Credenciales Invalidas");
            System.out.println("paso por aqui1");
        }         
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        System.out.println("paso por aqui2");
    }   
}