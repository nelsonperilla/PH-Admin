package entities;

import entities.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Publicacion.class)
public class Publicacion_ { 

    public static volatile SingularAttribute<Publicacion, String> descripcion;
    public static volatile SingularAttribute<Publicacion, Empleado> codigoEmpleado;
    public static volatile SingularAttribute<Publicacion, String> encabezado;
    public static volatile SingularAttribute<Publicacion, Date> fechaPublicacion;
    public static volatile SingularAttribute<Publicacion, Integer> codigoPublicacion;

}