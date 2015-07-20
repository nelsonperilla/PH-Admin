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
import javax.validation.constraints.Size;

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "rol")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r"),
    @NamedQuery(name = "Rol.findByDescripcionRol", query = "SELECT r FROM Rol r WHERE r.descripcionRol = :descripcionRol"),
    @NamedQuery(name = "Rol.findByEstadoRol", query = "SELECT r FROM Rol r WHERE r.estadoRol = :estadoRol"),
    @NamedQuery(name = "Rol.findByCodigoRol", query = "SELECT r FROM Rol r WHERE r.codigoRol = :codigoRol")})
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 125)
    @Column(name = "descripcionRol")
    private String descripcionRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estadoRol")
    private boolean estadoRol;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoRol")
    private Integer codigoRol;
    @JoinColumn(name = "codigoRol", referencedColumnName = "codigoRol", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Rolpermisos rolpermisos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoRol")
    private List<Usuario> usuarioList;

    public Rol() {
    }

    public Rol(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    public Rol(Integer codigoRol, String descripcionRol, boolean estadoRol) {
        this.codigoRol = codigoRol;
        this.descripcionRol = descripcionRol;
        this.estadoRol = estadoRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public boolean getEstadoRol() {
        return estadoRol;
    }

    public void setEstadoRol(boolean estadoRol) {
        this.estadoRol = estadoRol;
    }

    public Integer getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    public Rolpermisos getRolpermisos() {
        return rolpermisos;
    }

    public void setRolpermisos(Rolpermisos rolpermisos) {
        this.rolpermisos = rolpermisos;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.codigoRol == null && other.codigoRol != null) || (this.codigoRol != null && !this.codigoRol.equals(other.codigoRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Rol[ codigoRol=" + codigoRol + " ]";
    }
    
}
