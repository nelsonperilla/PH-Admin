package controlador;

import entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.UsuarioFacadeLocal;

@ManagedBean
@SessionScoped
public class controladorUsuarios implements Serializable {

    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    private Usuario us = new Usuario();

    public controladorUsuarios() {

    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
    
    

    public List<Usuario> findAll() {
        return this.usuarioFacade.findAll();
    }

    public String add() {
        this.usuarioFacade.create(this.us);
        this.us = new Usuario();
        return "consultar";

    }

    public void delete(Usuario us) {
        this.usuarioFacade.remove(us);

    }

    public String edit(Usuario us) {
        this.us = us;
        return "edit";

    }

    public String edit() {
        this.usuarioFacade.edit(this.us);
        return " consultar";
    }

}
