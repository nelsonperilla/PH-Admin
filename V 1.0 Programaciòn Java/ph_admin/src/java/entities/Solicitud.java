/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "solicitud")
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s"),
    @NamedQuery(name = "Solicitud.findByCodigoSolicitud", query = "SELECT s FROM Solicitud s WHERE s.codigoSolicitud = :codigoSolicitud"),
    @NamedQuery(name = "Solicitud.findByEstadoSolicitud", query = "SELECT s FROM Solicitud s WHERE s.estadoSolicitud = :estadoSolicitud"),
    @NamedQuery(name = "Solicitud.findByDescripcionSolicitud", query = "SELECT s FROM Solicitud s WHERE s.descripcionSolicitud = :descripcionSolicitud")})
public class Solicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoSolicitud")
    private Integer codigoSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estadoSolicitud")
    private boolean estadoSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 125)
    @Column(name = "descripcionSolicitud")
    private String descripcionSolicitud;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitud")
    private Solicitudusuario solicitudusuario;

    public Solicitud() {
    }

    public Solicitud(Integer codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }

    public Solicitud(Integer codigoSolicitud, boolean estadoSolicitud, String descripcionSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
        this.estadoSolicitud = estadoSolicitud;
        this.descripcionSolicitud = descripcionSolicitud;
    }

    public Integer getCodigoSolicitud() {
        return codigoSolicitud;
    }

    public void setCodigoSolicitud(Integer codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }

    public boolean getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(boolean estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getDescripcionSolicitud() {
        return descripcionSolicitud;
    }

    public void setDescripcionSolicitud(String descripcionSolicitud) {
        this.descripcionSolicitud = descripcionSolicitud;
    }

    public Solicitudusuario getSolicitudusuario() {
        return solicitudusuario;
    }

    public void setSolicitudusuario(Solicitudusuario solicitudusuario) {
        this.solicitudusuario = solicitudusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSolicitud != null ? codigoSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.codigoSolicitud == null && other.codigoSolicitud != null) || (this.codigoSolicitud != null && !this.codigoSolicitud.equals(other.codigoSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Solicitud[ codigoSolicitud=" + codigoSolicitud + " ]";
    }
    
}
