package entities;

import entities.Propietario;
import entities.Solicitud;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Solicitudusuario.class)
public class Solicitudusuario_ { 

    public static volatile SingularAttribute<Solicitudusuario, Date> fechaSolicitud;
    public static volatile SingularAttribute<Solicitudusuario, Solicitud> solicitud;
    public static volatile SingularAttribute<Solicitudusuario, Integer> codigoSolicitud;
    public static volatile SingularAttribute<Solicitudusuario, Propietario> codigoPropietario;
    public static volatile SingularAttribute<Solicitudusuario, Date> fechaRespuesta;

}