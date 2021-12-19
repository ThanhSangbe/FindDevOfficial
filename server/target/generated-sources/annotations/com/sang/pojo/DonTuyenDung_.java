package com.sang.pojo;

import com.sang.pojo.Candidate;
import com.sang.pojo.Employer;
import com.sang.pojo.Job;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-12-09T19:44:46", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(DonTuyenDung.class)
public class DonTuyenDung_ { 

    public static volatile SingularAttribute<DonTuyenDung, Date> datestart;
    public static volatile SingularAttribute<DonTuyenDung, Job> idJob;
    public static volatile SingularAttribute<DonTuyenDung, Candidate> idCandidate;
    public static volatile SingularAttribute<DonTuyenDung, Integer> id;
    public static volatile SingularAttribute<DonTuyenDung, Employer> idEmployer;

}