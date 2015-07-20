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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "rolpermisos")
@NamedQueries({
    @NamedQuery(name = "Rolpermisos.findAll", query = "SELECT r FROM Rolpermisos r"),
    @NamedQuery(name = "Rolpermisos.findByCodigoRol", query = "SELECT r FROM Rolpermisos r WHERE r.codigoRol = :codigoRol")})
public class Rolpermisos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoRol")
    private Integer codigoRol;
    @JoinColumn(name = "codigoPermiso", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Permisos codigoPermiso;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "rolpermisos")
    private Rol rol;

    public Rolpermisos() {
    }

    public Rolpermisos(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    public Integer getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    public Permisos getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(Permisos codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoRol != null ? codigoRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolpermisos)) {
            return false;
        }
        Rolpermisos other = (Rolpermisos) object;
        if ((this.codigoRol == null && other.codigoRol != null) || (this.codigoRol != null && !this.codigoRol.equals(other.codigoRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Rolpermisos[ codigoRol=" + codigoRol + " ]";
    }
    
}
