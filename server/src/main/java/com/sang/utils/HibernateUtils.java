
package com.sang.utils;
import com.sang.pojo.Candidate;
import com.sang.pojo.DonTuyenDung;
import com.sang.pojo.Job;
import com.sang.pojo.TinTuyenDung;
import com.sang.pojo.Employer;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
public class HibernateUtils {
    private static final SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration();
		Properties prop = new Properties();
                prop.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		prop.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		prop.put(Environment.URL,"jdbc:mysql://localhost:3306/finddevdb");
		prop.put(Environment.USER,"root");
		prop.put(Environment.PASS,"123456");
		prop.put(Environment.SHOW_SQL,"true");
		cfg.setProperties(prop);
		//ADD CLASS
		cfg.addAnnotatedClass(Employer.class);
		cfg.addAnnotatedClass(TinTuyenDung.class);
                cfg.addAnnotatedClass(Job.class);
                cfg.addAnnotatedClass(DonTuyenDung.class);
                cfg.addAnnotatedClass(Candidate.class);
		ServiceRegistry register = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(register);
	}
	public static  SessionFactory getFactory()
	{
		return sessionFactory;
	}
}
