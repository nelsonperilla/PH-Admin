package entities;

import entities.Publicacion;
import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> seguro;
    public static volatile SingularAttribute<Empleado, Integer> codigoEmpleado;
    public static volatile SingularAttribute<Empleado, String> salario;
    public static volatile SingularAttribute<Empleado, String> tipoContrato;
    public static volatile SingularAttribute<Empleado, Usuario> usuario;
    public static volatile SingularAttribute<Empleado, String> cargo;
    public static volatile ListAttribute<Empleado, Publicacion> publicacionList;
    public static volatile SingularAttribute<Empleado, String> arp;

}