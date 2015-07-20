package entities;

import entities.Empleado;
import entities.Prooveedor;
import entities.Propietario;
import entities.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:53")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, String> numeroCelular;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, Rol> codigoRol;
    public static volatile SingularAttribute<Usuario, Propietario> propietario;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, String> nombres;
    public static volatile SingularAttribute<Usuario, String> tipoDocumento;
    public static volatile SingularAttribute<Usuario, Date> fechaIngreso;
    public static volatile SingularAttribute<Usuario, String> numeroFijo;
    public static volatile SingularAttribute<Usuario, Integer> codigoUsuario;
    public static volatile SingularAttribute<Usuario, Empleado> empleado;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, Boolean> estadoUsuario;
    public static volatile SingularAttribute<Usuario, Date> fechaSalida;
    public static volatile SingularAttribute<Usuario, Prooveedor> prooveedor;
    public static volatile SingularAttribute<Usuario, Integer> numeroDocumento;

}