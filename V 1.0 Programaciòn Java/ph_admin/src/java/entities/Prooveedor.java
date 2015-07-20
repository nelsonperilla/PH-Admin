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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "prooveedor")
@NamedQueries({
    @NamedQuery(name = "Prooveedor.findAll", query = "SELECT p FROM Prooveedor p"),
    @NamedQuery(name = "Prooveedor.findByCodigoProoveedor", query = "SELECT p FROM Prooveedor p WHERE p.codigoProoveedor = :codigoProoveedor"),
    @NamedQuery(name = "Prooveedor.findByDescripcionProoveedor", query = "SELECT p FROM Prooveedor p WHERE p.descripcionProoveedor = :descripcionProoveedor"),
    @NamedQuery(name = "Prooveedor.findByTipoProoveedor", query = "SELECT p FROM Prooveedor p WHERE p.tipoProoveedor = :tipoProoveedor")})
public class Prooveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoProoveedor")
    private Integer codigoProoveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 125)
    @Column(name = "descripcionProoveedor")
    private String descripcionProoveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoProoveedor")
    private String tipoProoveedor;
    @JoinColumn(name = "codigoProoveedor", referencedColumnName = "codigoUsuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Prooveedor() {
    }

    public Prooveedor(Integer codigoProoveedor) {
        this.codigoProoveedor = codigoProoveedor;
    }

    public Prooveedor(Integer codigoProoveedor, String descripcionProoveedor, String tipoProoveedor) {
        this.codigoProoveedor = codigoProoveedor;
        this.descripcionProoveedor = descripcionProoveedor;
        this.tipoProoveedor = tipoProoveedor;
    }

    public Integer getCodigoProoveedor() {
        return codigoProoveedor;
    }

    public void setCodigoProoveedor(Integer codigoProoveedor) {
        this.codigoProoveedor = codigoProoveedor;
    }

    public String getDescripcionProoveedor() {
        return descripcionProoveedor;
    }

    public void setDescripcionProoveedor(String descripcionProoveedor) {
        this.descripcionProoveedor = descripcionProoveedor;
    }

    public String getTipoProoveedor() {
        return tipoProoveedor;
    }

    public void setTipoProoveedor(String tipoProoveedor) {
        this.tipoProoveedor = tipoProoveedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProoveedor != null ? codigoProoveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prooveedor)) {
            return false;
        }
        Prooveedor other = (Prooveedor) object;
        if ((this.codigoProoveedor == null && other.codigoProoveedor != null) || (this.codigoProoveedor != null && !this.codigoProoveedor.equals(other.codigoProoveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Prooveedor[ codigoProoveedor=" + codigoProoveedor + " ]";
    }
    
}
