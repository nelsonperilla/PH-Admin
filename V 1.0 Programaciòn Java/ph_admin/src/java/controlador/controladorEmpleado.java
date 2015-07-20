
package controlador;

import entities.Empleado;
import entities.Permisos;
import entities.Rol;
import entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.EmpleadoFacadeLocal;


@ManagedBean
@RequestScoped
public class controladorEmpleado implements Serializable {
    @EJB
    private EmpleadoFacadeLocal empleadoFacade;
    private Empleado emp = new Empleado();
    

    public controladorEmpleado() {
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
    
     public List<Empleado> findAll() {
        return this.empleadoFacade.findAll();
    }

    public String add() {
        this.empleadoFacade.create(this.emp);
        this.emp = new Empleado();
        return "consultar";

    }

    public void delete(Empleado emp) {
        this.empleadoFacade.remove(emp);

    }

    public String edit(Permisos per) {
        this.emp = emp;
        return "edit";

    }

    public String edit() {
        this.empleadoFacade.edit(this.emp);
        return " consultar";
    }

    
}
