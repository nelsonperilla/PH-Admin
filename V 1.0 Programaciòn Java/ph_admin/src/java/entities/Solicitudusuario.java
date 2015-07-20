/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "solicitudusuario")
@NamedQueries({
    @NamedQuery(name = "Solicitudusuario.findAll", query = "SELECT s FROM Solicitudusuario s"),
    @NamedQuery(name = "Solicitudusuario.findByCodigoSolicitud", query = "SELECT s FROM Solicitudusuario s WHERE s.codigoSolicitud = :codigoSolicitud"),
    @NamedQuery(name = "Solicitudusuario.findByFechaSolicitud", query = "SELECT s FROM Solicitudusuario s WHERE s.fechaSolicitud = :fechaSolicitud"),
    @NamedQuery(name = "Solicitudusuario.findByFechaRespuesta", query = "SELECT s FROM Solicitudusuario s WHERE s.fechaRespuesta = :fechaRespuesta")})
public class Solicitudusuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoSolicitud")
    private Integer codigoSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaSolicitud")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaRespuesta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRespuesta;
    @JoinColumn(name = "codigoPropietario", referencedColumnName = "codigoPropietario")
    @ManyToOne(optional = false)
    private Propietario codigoPropietario;
    @JoinColumn(name = "codigoSolicitud", referencedColumnName = "codigoSolicitud", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Solicitud solicitud;

    public Solicitudusuario() {
    }

    public Solicitudusuario(Integer codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }

    public Solicitudusuario(Integer codigoSolicitud, Date fechaSolicitud, Date fechaRespuesta) {
        this.codigoSolicitud = codigoSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRespuesta = fechaRespuesta;
    }

    public Integer getCodigoSolicitud() {
        return codigoSolicitud;
    }

    public void setCodigoSolicitud(Integer codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public Propietario getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(Propietario codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
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
        if (!(object instanceof Solicitudusuario)) {
            return false;
        }
        Solicitudusuario other = (Solicitudusuario) object;
        if ((this.codigoSolicitud == null && other.codigoSolicitud != null) || (this.codigoSolicitud != null && !this.codigoSolicitud.equals(other.codigoSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Solicitudusuario[ codigoSolicitud=" + codigoSolicitud + " ]";
    }
    
}
