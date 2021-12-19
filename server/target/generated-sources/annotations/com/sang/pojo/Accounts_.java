package com.sang.pojo;

import com.sang.pojo.Candidate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-12-09T19:44:46", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Accounts.class)
public class Accounts_ { 

    public static volatile SingularAttribute<Accounts, Integer> categoryAccounts;
    public static volatile SingularAttribute<Accounts, Candidate> candidate;
    public static volatile SingularAttribute<Accounts, String> pass;
    public static volatile SingularAttribute<Accounts, String> nickname;
    public static volatile SingularAttribute<Accounts, Integer> id;

}