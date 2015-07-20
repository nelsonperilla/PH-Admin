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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "publicacion")
@NamedQueries({
    @NamedQuery(name = "Publicacion.findAll", query = "SELECT p FROM Publicacion p"),
    @NamedQuery(name = "Publicacion.findByCodigoPublicacion", query = "SELECT p FROM Publicacion p WHERE p.codigoPublicacion = :codigoPublicacion"),
    @NamedQuery(name = "Publicacion.findByDescripcion", query = "SELECT p FROM Publicacion p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Publicacion.findByEncabezado", query = "SELECT p FROM Publicacion p WHERE p.encabezado = :encabezado"),
    @NamedQuery(name = "Publicacion.findByFechaPublicacion", query = "SELECT p FROM Publicacion p WHERE p.fechaPublicacion = :fechaPublicacion")})
public class Publicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoPublicacion")
    private Integer codigoPublicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "encabezado")
    private String encabezado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaPublicacion")
    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public Publicacion() {
    }

    public Publicacion(Integer codigoPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
    }

    public Publicacion(Integer codigoPublicacion, String descripcion, String encabezado, Date fechaPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
        this.descripcion = descripcion;
        this.encabezado = encabezado;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getCodigoPublicacion() {
        return codigoPublicacion;
    }

    public void setCodigoPublicacion(Integer codigoPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Empleado getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Empleado codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPublicacion != null ? codigoPublicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.codigoPublicacion == null && other.codigoPublicacion != null) || (this.codigoPublicacion != null && !this.codigoPublicacion.equals(other.codigoPublicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Publicacion[ codigoPublicacion=" + codigoPublicacion + " ]";
    }
    
}
