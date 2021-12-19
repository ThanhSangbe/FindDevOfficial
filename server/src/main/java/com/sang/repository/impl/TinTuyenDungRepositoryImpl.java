/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sang.repository.impl;

import com.sang.pojo.TinTuyenDung;
import com.sang.repository.TinTuyenDungRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TinTuyenDungRepositoryImpl implements TinTuyenDungRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<TinTuyenDung> getTinTuyenDungs() {
         Session session = sessionFactory.getObject().getCurrentSession();
//          CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery query = builder.createQuery();
//            Root<TinTuyenDung> rootT = query.from(TinTuyenDung.class);
//            query.select(rootT);
            Query query = session.createQuery("FROM TinTuyenDung");
//            return session.createQuery(query).getResultList();
            return query.getResultList();
        
    }

}
