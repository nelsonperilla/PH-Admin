/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entities.Apartamento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nelson
 */
@Local
public interface ApartamentoFacadeLocal {

    void create(Apartamento apartamento);

    void edit(Apartamento apartamento);

    void remove(Apartamento apartamento);

    Apartamento find(Object id);

    List<Apartamento> findAll();

    List<Apartamento> findRange(int[] range);

    int count();
    
}
