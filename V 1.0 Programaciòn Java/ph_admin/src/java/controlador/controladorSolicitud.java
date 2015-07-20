package controlador;

import entities.Solicitud;
import entities.Solicitudusuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.SolicitudFacadeLocal;

@ManagedBean
@RequestScoped
public class controladorSolicitud implements Serializable {

    @EJB
    private SolicitudFacadeLocal solicitudFacade;
    private Solicitud sol = new Solicitud();

    public controladorSolicitud() {
    }

    public Solicitud getSol() {
        return sol;
    }

    public void setSol(Solicitud sol) {
        this.sol = sol;
    }

    public List<Solicitud> findAll() {
        return this.solicitudFacade.findAll();
    }

    public String add() {
        this.solicitudFacade.create(this.sol);
        this.sol = new Solicitud();
        return "consultar";

    }

    public void delete(Solicitud sol) {
        this.solicitudFacade.remove(sol);

    }

    public String edit(Solicitud sol) {
        this.sol = sol;
        return "edit";

    }

    public String edit() {
        this.solicitudFacade.edit(this.sol);
        return " consultar";
    }

}
