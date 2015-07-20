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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "propietario")
@NamedQueries({
    @NamedQuery(name = "Propietario.findAll", query = "SELECT p FROM Propietario p"),
    @NamedQuery(name = "Propietario.findByCodigoPropietario", query = "SELECT p FROM Propietario p WHERE p.codigoPropietario = :codigoPropietario"),
    @NamedQuery(name = "Propietario.findByNumeroContacto", query = "SELECT p FROM Propietario p WHERE p.numeroContacto = :numeroContacto"),
    @NamedQuery(name = "Propietario.findByCodigoSolicitud", query = "SELECT p FROM Propietario p WHERE p.codigoSolicitud = :codigoSolicitud")})
public class Propietario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoPropietario")
    private Integer codigoPropietario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroContacto")
    private int numeroContacto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoSolicitud")
    private int codigoSolicitud;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propietario")
    private Apartamento apartamento;
    @JoinColumn(name = "codigoPropietario", referencedColumnName = "codigoUsuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoPropietario")
    private List<Vehiculo> vehiculoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoPropietario")
    private List<Solicitudusuario> solicitudusuarioList;

    public Propietario() {
    }

    public Propietario(Integer codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
    }

    public Propietario(Integer codigoPropietario, int numeroContacto, int codigoSolicitud) {
        this.codigoPropietario = codigoPropietario;
        this.numeroContacto = numeroContacto;
        this.codigoSolicitud = codigoSolicitud;
    }

    public Integer getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(Integer codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public int getCodigoSolicitud() {
        return codigoSolicitud;
    }

    public void setCodigoSolicitud(int codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    public List<Solicitudusuario> getSolicitudusuarioList() {
        return solicitudusuarioList;
    }

    public void setSolicitudusuarioList(List<Solicitudusuario> solicitudusuarioList) {
        this.solicitudusuarioList = solicitudusuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPropietario != null ? codigoPropietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.codigoPropietario == null && other.codigoPropietario != null) || (this.codigoPropietario != null && !this.codigoPropietario.equals(other.codigoPropietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Propietario[ codigoPropietario=" + codigoPropietario + " ]";
    }
    
}
