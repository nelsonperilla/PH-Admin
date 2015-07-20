package entities;

import entities.Propietario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-20T01:46:54")
@StaticMetamodel(Apartamento.class)
public class Apartamento_ { 

    public static volatile SingularAttribute<Apartamento, Integer> codigoApto;
    public static volatile SingularAttribute<Apartamento, Propietario> propietario;
    public static volatile SingularAttribute<Apartamento, Integer> numeroApto;
    public static volatile SingularAttribute<Apartamento, Boolean> estadoApto;
    public static volatile SingularAttribute<Apartamento, Integer> numeroTorre;

}