package controlador;

import entities.Apartamento;
import entities.Solicitudusuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.SolicitudusuarioFacadeLocal;

@ManagedBean
@RequestScoped
public class controladorSolicitudUsuario implements Serializable {

    @EJB
    private SolicitudusuarioFacadeLocal solicitudusuarioFacade;
    private Solicitudusuario solusu = new Solicitudusuario();

    public controladorSolicitudUsuario() {
    }

    public Solicitudusuario getSolusu() {
        return solusu;
    }

    public void setSolusu(Solicitudusuario solusu) {
        this.solusu = solusu;
    }
        public List<Solicitudusuario> findAll() {
        return this.solicitudusuarioFacade.findAll();
    }

    public String add() {
        this.solicitudusuarioFacade.create(this.solusu);
        this.solusu = new Solicitudusuario();
        return "consultar";

    }

    public void delete(Solicitudusuario solusu) {
        this.solicitudusuarioFacade.remove(solusu);

    }

    public String edit(Solicitudusuario solusu) {
        this.solusu = solusu;
        return "edit";

    }

    public String edit() {
        this.solicitudusuarioFacade.edit(this.solusu);
        return " consultar";
    }


    
}
