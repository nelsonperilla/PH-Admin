/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entities.Apartamento;
import entities.Prooveedor;
import entities.Propietario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.ApartamentoFacadeLocal;

/**
 *
 * @author Nelson
 */
@ManagedBean
@RequestScoped
public class controladorApartamento implements Serializable {

    @EJB
    private ApartamentoFacadeLocal apartamentoFacade;
    private Apartamento apart = new Apartamento();

    public controladorApartamento() {
    }

    public Apartamento getApart() {
        return apart;
    }

    public void setApart(Apartamento apart) {
        this.apart = apart;
    }

    public List<Apartamento> findAll() {
        return this.apartamentoFacade.findAll();
    }

    public String add() {
        this.apartamentoFacade.create(this.apart);
        this.apart = new Apartamento();
        return "consultar";

    }

    public void delete(Apartamento apart) {
        this.apartamentoFacade.remove(apart);

    }

    public String edit(Apartamento apart) {
        this.apart = apart;
        return "edit";

    }

    public String edit() {
        this.apartamentoFacade.edit(this.apart);
        return " consultar";
    }

}
