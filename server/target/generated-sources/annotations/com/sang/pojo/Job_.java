package com.sang.pojo;

import com.sang.pojo.Candidate;
import com.sang.pojo.DonTuyenDung;
import com.sang.pojo.TinTuyenDung;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-12-09T19:44:46", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Job.class)
public class Job_ { 

    public static volatile CollectionAttribute<Job, TinTuyenDung> tintuyendungCollection;
    public static volatile SingularAttribute<Job, Integer> id;
    public static volatile CollectionAttribute<Job, Candidate> candidateCollection;
    public static volatile CollectionAttribute<Job, DonTuyenDung> dontuyendungCollection;
    public static volatile SingularAttribute<Job, String> title;

}