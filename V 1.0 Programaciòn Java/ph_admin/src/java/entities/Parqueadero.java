/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "parqueadero")
@NamedQueries({
    @NamedQuery(name = "Parqueadero.findAll", query = "SELECT p FROM Parqueadero p"),
    @NamedQuery(name = "Parqueadero.findByCodigoParqueadero", query = "SELECT p FROM Parqueadero p WHERE p.codigoParqueadero = :codigoParqueadero"),
    @NamedQuery(name = "Parqueadero.findByPlaca", query = "SELECT p FROM Parqueadero p WHERE p.placa = :placa"),
    @NamedQuery(name = "Parqueadero.findByEstado", query = "SELECT p FROM Parqueadero p WHERE p.estado = :estado"),
    @NamedQuery(name = "Parqueadero.findByObservacionParqueadero", query = "SELECT p FROM Parqueadero p WHERE p.observacionParqueadero = :observacionParqueadero")})
public class Parqueadero implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoParqueadero")
    private Integer codigoParqueadero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Size(max = 125)
    @Column(name = "ObservacionParqueadero")
    private String observacionParqueadero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoParqueadero")
    private List<Vehiculo> vehiculoList;

    public Parqueadero() {
    }

    public Parqueadero(Integer codigoParqueadero) {
        this.codigoParqueadero = codigoParqueadero;
    }

    public Parqueadero(Integer codigoParqueadero, String placa, boolean estado) {
        this.codigoParqueadero = codigoParqueadero;
        this.placa = placa;
        this.estado = estado;
    }

    public Integer getCodigoParqueadero() {
        return codigoParqueadero;
    }

    public void setCodigoParqueadero(Integer codigoParqueadero) {
        this.codigoParqueadero = codigoParqueadero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getObservacionParqueadero() {
        return observacionParqueadero;
    }

    public void setObservacionParqueadero(String observacionParqueadero) {
        this.observacionParqueadero = observacionParqueadero;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoParqueadero != null ? codigoParqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueadero)) {
            return false;
        }
        Parqueadero other = (Parqueadero) object;
        if ((this.codigoParqueadero == null && other.codigoParqueadero != null) || (this.codigoParqueadero != null && !this.codigoParqueadero.equals(other.codigoParqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Parqueadero[ codigoParqueadero=" + codigoParqueadero + " ]";
    }
    
}
