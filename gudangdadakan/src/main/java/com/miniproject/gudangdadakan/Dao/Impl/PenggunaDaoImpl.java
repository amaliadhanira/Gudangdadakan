package com.miniproject.gudangdadakan.Dao.Impl;

import com.miniproject.gudangdadakan.Model.Pengguna;
import com.miniproject.gudangdadakan.Dao.PenggunaDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PenggunaDaoImpl implements PenggunaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Pengguna> getUsernameAndPassword(String username, String password){
        return entityManager.createNamedQuery("findEmailAndPassword", Pengguna.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getResultList();
    }
}
