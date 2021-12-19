package com.sang.pojo;

import com.sang.pojo.Employer;
import com.sang.pojo.Job;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-12-09T19:44:46", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(TinTuyenDung.class)
public class TinTuyenDung_ { 

    public static volatile SingularAttribute<TinTuyenDung, String> descrip;
    public static volatile SingularAttribute<TinTuyenDung, Job> idJob;
    public static volatile SingularAttribute<TinTuyenDung, Integer> id;
    public static volatile SingularAttribute<TinTuyenDung, String> title;
    public static volatile SingularAttribute<TinTuyenDung, String> experience;
    public static volatile SingularAttribute<TinTuyenDung, BigInteger> salary;
    public static volatile SingularAttribute<TinTuyenDung, Date> startdate;
    public static volatile SingularAttribute<TinTuyenDung, String> skils;
    public static volatile SingularAttribute<TinTuyenDung, Employer> idEmployer;

}