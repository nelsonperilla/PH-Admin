package entities;

import entities.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Parqueadero.class)
public class Parqueadero_ { 

    public static volatile SingularAttribute<Parqueadero, Boolean> estado;
    public static volatile SingularAttribute<Parqueadero, String> observacionParqueadero;
    public static volatile SingularAttribute<Parqueadero, Integer> codigoParqueadero;
    public static volatile ListAttribute<Parqueadero, Vehiculo> vehiculoList;
    public static volatile SingularAttribute<Parqueadero, String> placa;

}