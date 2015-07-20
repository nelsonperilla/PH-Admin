/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entities.Permisos;
import entities.Rol;
import entities.Rolpermisos;
import entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.RolFacadeLocal;

/**
 *
 * @author Nelson
 */
@ManagedBean
@RequestScoped
public class controladorRol implements Serializable{
    @EJB
    private RolFacadeLocal rolFacade;
    private Rol rol=new Rol();

   
    public controladorRol() {
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
       public List<Rol> findAll() {
        return this.rolFacade.findAll();
    }

    public String add() {
        this.rolFacade.create(this.rol);
        this.rol = new Rol();
        return "consultar";

    }

    public void delete(Rol rol) {
        this.rolFacade.remove(rol);

    }

    public String edit(Rol rol) {
        this.rol = rol;
        return "edit";

    }

    public String edit() {
        this.rolFacade.edit(this.rol);
        return " consultar";
    }

    
}
