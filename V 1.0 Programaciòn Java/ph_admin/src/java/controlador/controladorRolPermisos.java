
package controlador;

import entities.Permisos;
import entities.Rolpermisos;
import entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.RolpermisosFacadeLocal;


@ManagedBean
@RequestScoped
public class controladorRolPermisos implements Serializable{
    @EJB
    private RolpermisosFacadeLocal rolpermisosFacade;
    private Rolpermisos rolper = new Rolpermisos();
    
    
    public controladorRolPermisos() {
    }

    public Rolpermisos getRolper() {
        return rolper;
    }

    public void setRolper(Rolpermisos rolper) {
        this.rolper = rolper;
    }
    
    
    public List<Rolpermisos> findAll() {
        return this.rolpermisosFacade.findAll();
    }

    public String add() {
        this.rolpermisosFacade.create(this.rolper);
        this.rolper = new Rolpermisos();
        return "consultar";

    }

    public void delete(Rolpermisos rolper) {
        this.rolpermisosFacade.remove(rolper);

    }

    public String edit(Rolpermisos rolper) {
        this.rolper = rolper;
        return "edit";

    }

    public String edit() {
        this.rolpermisosFacade.edit(this.rolper);
        return " consultar";
    }

    
    
    
}
