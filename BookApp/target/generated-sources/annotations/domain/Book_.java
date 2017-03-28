package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, String> isbn;
	public static volatile SingularAttribute<Book, String> name;
	public static volatile ListAttribute<Book, Publisher> publishers;
	public static volatile SingularAttribute<Book, Integer> id;
	public static volatile ListAttribute<Book, Author> authors;

}

