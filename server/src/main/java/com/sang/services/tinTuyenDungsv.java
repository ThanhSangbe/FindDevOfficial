package com.sang.services;

import com.sang.pojo.TinTuyenDung;
import com.sang.utils.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class tinTuyenDungsv {

    public static SessionFactory sessionFactory = HibernateUtils.getFactory();

    public List<TinTuyenDung> getResultkeys(String keyword) {

        try ( Session session = sessionFactory.openSession()) {

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<TinTuyenDung> query = builder.createQuery(TinTuyenDung.class);
            Root<TinTuyenDung> rootT = query.from(TinTuyenDung.class);
            query.where(builder.like(rootT.get("title"), "%%" + keyword + "%%"));
            return session.createQuery(query).getResultList();

        }

    }
    public TinTuyenDung getTinTuyenDung(int id)
    {
        try ( Session session = sessionFactory.openSession()) {
            TinTuyenDung ttt = session.get(TinTuyenDung.class, id);
            return ttt;
        }
    }
}
