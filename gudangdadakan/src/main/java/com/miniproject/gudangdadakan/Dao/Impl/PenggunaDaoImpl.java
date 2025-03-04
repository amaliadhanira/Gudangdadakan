package com.miniproject.gudangdadakan.Dao.Impl;

import com.miniproject.gudangdadakan.Model.Pengguna;
import com.miniproject.gudangdadakan.Dao.PenggunaDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

@Repository

public class PenggunaDaoImpl implements PenggunaDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<Pengguna> getUsernameAndPassword(String username, String password){
        return getSession().getNamedQuery("findEmailAndPassword")
                .setParameter("username", username)
                .setParameter("password", password)
                .getResultList();
    }
}
