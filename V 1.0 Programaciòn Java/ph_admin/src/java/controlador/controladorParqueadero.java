
package controlador;

import entities.Parqueadero;
import entities.Vehiculo;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.ParqueaderoFacadeLocal;
@ManagedBean
@RequestScoped
public class controladorParqueadero implements Serializable{
    @EJB
    private ParqueaderoFacadeLocal parqueaderoFacade;
    private Parqueadero parq = new Parqueadero();

    
    public controladorParqueadero() {
    }

    public Parqueadero getParq() {
        return parq;
    }

    public void setParq(Parqueadero parq) {
        this.parq = parq;
    }
    
    
    public List<Parqueadero> findAll() {
        return this.parqueaderoFacade.findAll();
    }

    public String add() {
        this.parqueaderoFacade.create(this.parq);
        this.parq = new Parqueadero();
        return "consultar";

    }

    public void delete(Parqueadero par) {
        this.parqueaderoFacade.remove(parq);

    }

    public String edit(Parqueadero parq) {
        this.parq = parq;
        return "edit";

    }

    public String edit() {
        this.parqueaderoFacade.edit(this.parq);
        return " consultar";
    }
}
