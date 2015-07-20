package entities;

import entities.Parqueadero;
import entities.Propietario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> observacionVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> color;
    public static volatile SingularAttribute<Vehiculo, Parqueadero> codigoParqueadero;
    public static volatile SingularAttribute<Vehiculo, Propietario> codigoPropietario;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}