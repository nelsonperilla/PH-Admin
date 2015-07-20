package entities;

import entities.Apartamento;
import entities.Solicitudusuario;
import entities.Usuario;
import entities.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:53")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile ListAttribute<Propietario, Solicitudusuario> solicitudusuarioList;
    public static volatile SingularAttribute<Propietario, Apartamento> apartamento;
    public static volatile SingularAttribute<Propietario, Usuario> usuario;
    public static volatile SingularAttribute<Propietario, Integer> codigoSolicitud;
    public static volatile SingularAttribute<Propietario, Integer> codigoPropietario;
    public static volatile ListAttribute<Propietario, Vehiculo> vehiculoList;
    public static volatile SingularAttribute<Propietario, Integer> numeroContacto;

}