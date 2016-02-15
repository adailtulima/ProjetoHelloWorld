package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Animal.class)
public abstract class Animal_ {

	public static volatile SingularAttribute<Animal, Integer> idade;
	public static volatile SingularAttribute<Animal, String> dono;
	public static volatile SingularAttribute<Animal, String> raca;
	public static volatile SingularAttribute<Animal, Long> id;

}

