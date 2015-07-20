/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "vehiculo")
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v"),
    @NamedQuery(name = "Vehiculo.findByColor", query = "SELECT v FROM Vehiculo v WHERE v.color = :color"),
    @NamedQuery(name = "Vehiculo.findByObservacionVehiculo", query = "SELECT v FROM Vehiculo v WHERE v.observacionVehiculo = :observacionVehiculo"),
    @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa")})
public class Vehiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 15)
    @Column(name = "color")
    private String color;
    @Size(max = 125)
    @Column(name = "observacionVehiculo")
    private String observacionVehiculo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "placa")
    private String placa;
    @JoinColumn(name = "codigoParqueadero", referencedColumnName = "codigoParqueadero")
    @ManyToOne(optional = false)
    private Parqueadero codigoParqueadero;
    @JoinColumn(name = "codigoPropietario", referencedColumnName = "codigoPropietario")
    @ManyToOne(optional = false)
    private Propietario codigoPropietario;

    public Vehiculo() {
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservacionVehiculo() {
        return observacionVehiculo;
    }

    public void setObservacionVehiculo(String observacionVehiculo) {
        this.observacionVehiculo = observacionVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Parqueadero getCodigoParqueadero() {
        return codigoParqueadero;
    }

    public void setCodigoParqueadero(Parqueadero codigoParqueadero) {
        this.codigoParqueadero = codigoParqueadero;
    }

    public Propietario getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(Propietario codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vehiculo[ placa=" + placa + " ]";
    }
    
}
