package controlador;

import entities.Solicitud;
import entities.Vehiculo;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.VehiculoFacadeLocal;

@ManagedBean
@RequestScoped
public class controladorVehiculo implements Serializable {

    @EJB
    private VehiculoFacadeLocal vehiculoFacade;
    private Vehiculo veh = new Vehiculo();

    public controladorVehiculo() {
    }

    public Vehiculo getVeh() {
        return veh;
    }

    public void setVeh(Vehiculo veh) {
        this.veh = veh;
    }

    public List<Vehiculo> findAll() {
        return this.vehiculoFacade.findAll();
    }

    public String add() {
        this.vehiculoFacade.create(this.veh);
        this.veh = new Vehiculo();
        return "consultar";

    }

    public void delete(Vehiculo veh) {
        this.vehiculoFacade.remove(veh);

    }

    public String edit(Vehiculo veh) {
        this.veh = veh;
        return "edit";

    }

    public String edit() {
        this.vehiculoFacade.edit(this.veh);
        return " consultar";
    }

}
