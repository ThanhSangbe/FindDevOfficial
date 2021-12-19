package com.sang.pojo;

import com.sang.pojo.Accounts;
import com.sang.pojo.DonTuyenDung;
import com.sang.pojo.Job;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-12-09T19:44:46", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Candidate.class)
public class Candidate_ { 

    public static volatile SingularAttribute<Candidate, Accounts> idAcc;
    public static volatile SingularAttribute<Candidate, String> address;
    public static volatile SingularAttribute<Candidate, String> cv;
    public static volatile SingularAttribute<Candidate, String> major;
    public static volatile SingularAttribute<Candidate, Job> idJob;
    public static volatile SingularAttribute<Candidate, String> phone;
    public static volatile SingularAttribute<Candidate, String> logo;
    public static volatile SingularAttribute<Candidate, Integer> id;
    public static volatile SingularAttribute<Candidate, String> fullname;
    public static volatile CollectionAttribute<Candidate, DonTuyenDung> dontuyendungCollection;
    public static volatile SingularAttribute<Candidate, String> email;

}