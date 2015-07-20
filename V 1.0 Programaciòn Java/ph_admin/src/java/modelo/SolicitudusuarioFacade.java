/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entities.Solicitudusuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nelson
 */
@Stateless
public class SolicitudusuarioFacade extends AbstractFacade<Solicitudusuario> implements SolicitudusuarioFacadeLocal {
    @PersistenceContext(unitName = "ph_adminPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SolicitudusuarioFacade() {
        super(Solicitudusuario.class);
    }
    
}
