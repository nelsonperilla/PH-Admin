
package controlador;

import entities.Prooveedor;
import entities.Propietario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.PropietarioFacadeLocal;


@ManagedBean
@RequestScoped
public class controladorPropietario implements Serializable{
    @EJB
    private PropietarioFacadeLocal propietarioFacade;
    private Propietario propie = new Propietario();

    
    public controladorPropietario() {
    }

    public Propietario getPropie() {
        return propie;
    }

    public void setPropie(Propietario propie) {
        this.propie = propie;
    }
     public List<Propietario> findAll() {
        return this.propietarioFacade.findAll();
    }

    public String add() {
        this.propietarioFacade.create(this.propie);
        this.propie = new Propietario();
        return "consultar";

    }

    public void delete(Prooveedor proo) {
        this.propietarioFacade.remove(propie);

    }

    public String edit(Prooveedor proo) {
        this.propie = propie;
        return "edit";

    }

    public String edit() {
        this.propietarioFacade.edit(this.propie);
        return " consultar";
    }

    
    
    
    
    
    
}
