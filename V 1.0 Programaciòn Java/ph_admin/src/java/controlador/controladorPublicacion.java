
package controlador;

import entities.Empleado;
import entities.Permisos;
import entities.Publicacion;
import entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.PublicacionFacadeLocal;

@ManagedBean
@RequestScoped
public class controladorPublicacion implements Serializable{
    @EJB
    private PublicacionFacadeLocal publicacionFacade;
    private Publicacion publ = new Publicacion();

   
    public controladorPublicacion() {
    }

    public Publicacion getPubl() {
        return publ;
    }

    public void setPubl(Publicacion publ) {
        this.publ = publ;
    }
    
      public List<Publicacion> findAll() {
        return this.publicacionFacade.findAll();
    }

    public String add() {
        this.publicacionFacade.create(this.publ);
        this.publ = new Publicacion();
        return "consultar";

    }

    public void delete(Publicacion publ) {
        this.publicacionFacade.remove(publ);

    }

    public String edit(Publicacion publ) {
        this.publ = publ;
        return "edit";

    }

    public String edit() {
        this.publicacionFacade.edit(this.publ);
        return " consultar";
    }

    
    
    
}
