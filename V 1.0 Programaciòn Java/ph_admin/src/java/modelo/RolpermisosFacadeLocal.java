/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entities.Rolpermisos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nelson
 */
@Local
public interface RolpermisosFacadeLocal {

    void create(Rolpermisos rolpermisos);

    void edit(Rolpermisos rolpermisos);

    void remove(Rolpermisos rolpermisos);

    Rolpermisos find(Object id);

    List<Rolpermisos> findAll();

    List<Rolpermisos> findRange(int[] range);

    int count();
    
}
