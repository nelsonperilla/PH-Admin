
package controlador;

import entities.Permisos;
import entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.PermisosFacadeLocal;


@ManagedBean
@RequestScoped
public class controladorPermisos implements Serializable {
    @EJB
    private PermisosFacadeLocal permisosFacade;
    private Permisos per = new Permisos();

  
    public controladorPermisos() {
    }

    public Permisos getPer() {
        return per;
    }

    public void setPer(Permisos per) {
        this.per = per;
    }
    
    
    public List<Permisos> findAll() {
        return this.permisosFacade.findAll();
    }

    public String add() {
        this.permisosFacade.create(this.per);
        this.per = new Permisos();
        return "consultar";

    }

    public void delete(Permisos per) {
        this.permisosFacade.remove(per);

    }

    public String edit(Permisos per) {
        this.per=per;
        return "editar";

    }

    public String edit() {
        this.permisosFacade.edit(this.per);
        return "consultar";
    }

    
    
}
