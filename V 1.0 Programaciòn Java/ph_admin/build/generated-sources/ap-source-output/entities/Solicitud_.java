package entities;

import entities.Solicitudusuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, Integer> codigoSolicitud;
    public static volatile SingularAttribute<Solicitud, Solicitudusuario> solicitudusuario;
    public static volatile SingularAttribute<Solicitud, Boolean> estadoSolicitud;
    public static volatile SingularAttribute<Solicitud, String> descripcionSolicitud;

}