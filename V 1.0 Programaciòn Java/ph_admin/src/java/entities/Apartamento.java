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

/**
 *
 * @author Nelson
 */
@Entity
@Table(name = "apartamento")
@NamedQueries({
    @NamedQuery(name = "Apartamento.findAll", query = "SELECT a FROM Apartamento a"),
    @NamedQuery(name = "Apartamento.findByCodigoApto", query = "SELECT a FROM Apartamento a WHERE a.codigoApto = :codigoApto"),
    @NamedQuery(name = "Apartamento.findByNumeroTorre", query = "SELECT a FROM Apartamento a WHERE a.numeroTorre = :numeroTorre"),
    @NamedQuery(name = "Apartamento.findByNumeroApto", query = "SELECT a FROM Apartamento a WHERE a.numeroApto = :numeroApto"),
    @NamedQuery(name = "Apartamento.findByEstadoApto", query = "SELECT a FROM Apartamento a WHERE a.estadoApto = :estadoApto")})
public class Apartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoApto")
    private Integer codigoApto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroTorre")
    private int numeroTorre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroApto")
    private int numeroApto;
    @Column(name = "estadoApto")
    private Boolean estadoApto;
    @JoinColumn(name = "codigoApto", referencedColumnName = "codigoPropietario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Propietario propietario;

    public Apartamento() {
    }

    public Apartamento(Integer codigoApto) {
        this.codigoApto = codigoApto;
    }

    public Apartamento(Integer codigoApto, int numeroTorre, int numeroApto) {
        this.codigoApto = codigoApto;
        this.numeroTorre = numeroTorre;
        this.numeroApto = numeroApto;
    }

    public Integer getCodigoApto() {
        return codigoApto;
    }

    public void setCodigoApto(Integer codigoApto) {
        this.codigoApto = codigoApto;
    }

    public int getNumeroTorre() {
        return numeroTorre;
    }

    public void setNumeroTorre(int numeroTorre) {
        this.numeroTorre = numeroTorre;
    }

    public int getNumeroApto() {
        return numeroApto;
    }

    public void setNumeroApto(int numeroApto) {
        this.numeroApto = numeroApto;
    }

    public Boolean getEstadoApto() {
        return estadoApto;
    }

    public void setEstadoApto(Boolean estadoApto) {
        this.estadoApto = estadoApto;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoApto != null ? codigoApto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apartamento)) {
            return false;
        }
        Apartamento other = (Apartamento) object;
        if ((this.codigoApto == null && other.codigoApto != null) || (this.codigoApto != null && !this.codigoApto.equals(other.codigoApto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Apartamento[ codigoApto=" + codigoApto + " ]";
    }
    
}
