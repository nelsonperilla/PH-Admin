
package controlador;

import entities.Prooveedor;
import entities.Publicacion;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.ProoveedorFacadeLocal;

@ManagedBean
@RequestScoped
public class controladorProoveedor implements Serializable{
    @EJB
    private ProoveedorFacadeLocal prooveedorFacade;
    private Prooveedor proo = new Prooveedor();

    public controladorProoveedor() {
    }

    public Prooveedor getProo() {
        return proo;
    }

    public void setProo(Prooveedor proo) {
        this.proo = proo;
    }
    public List<Prooveedor> findAll() {
        return this.prooveedorFacade.findAll();
    }

    public String add() {
        this.prooveedorFacade.create(this.proo);
        this.proo = new Prooveedor();
        return "consultar";

    }

    public void delete(Prooveedor proo) {
        this.prooveedorFacade.remove(proo);

    }

    public String edit(Prooveedor proo) {
        this.proo = proo;
        return "edit";

    }

    public String edit() {
        this.prooveedorFacade.edit(this.proo);
        return " consultar";
    }

    
    
    
    
}
