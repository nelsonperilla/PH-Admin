package entities;

import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Prooveedor.class)
public class Prooveedor_ { 

    public static volatile SingularAttribute<Prooveedor, Integer> codigoProoveedor;
    public static volatile SingularAttribute<Prooveedor, String> descripcionProoveedor;
    public static volatile SingularAttribute<Prooveedor, Usuario> usuario;
    public static volatile SingularAttribute<Prooveedor, String> tipoProoveedor;

}