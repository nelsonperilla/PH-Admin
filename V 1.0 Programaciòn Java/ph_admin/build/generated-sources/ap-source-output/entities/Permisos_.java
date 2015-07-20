package entities;

import entities.Rolpermisos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Permisos.class)
public class Permisos_ { 

    public static volatile SingularAttribute<Permisos, String> descripcion;
    public static volatile ListAttribute<Permisos, Rolpermisos> rolpermisosList;
    public static volatile SingularAttribute<Permisos, Integer> codigo;
    public static volatile SingularAttribute<Permisos, Boolean> estado;

}