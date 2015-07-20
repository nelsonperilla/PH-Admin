/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entities.Solicitudusuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nelson
 */
@Local
public interface SolicitudusuarioFacadeLocal {

    void create(Solicitudusuario solicitudusuario);

    void edit(Solicitudusuario solicitudusuario);

    void remove(Solicitudusuario solicitudusuario);

    Solicitudusuario find(Object id);

    List<Solicitudusuario> findAll();

    List<Solicitudusuario> findRange(int[] range);

    int count();
    
}
