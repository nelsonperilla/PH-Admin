/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entities.Prooveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nelson
 */
@Stateless
public class ProoveedorFacade extends AbstractFacade<Prooveedor> implements ProoveedorFacadeLocal {
    @PersistenceContext(unitName = "ph_adminPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProoveedorFacade() {
        super(Prooveedor.class);
    }
    
}
