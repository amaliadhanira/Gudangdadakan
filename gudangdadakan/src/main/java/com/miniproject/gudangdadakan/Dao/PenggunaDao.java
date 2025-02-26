package com.miniproject.gudangdadakan.Dao;

import com.miniproject.gudangdadakan.Model.Pengguna;

import java.util.List;

public interface PenggunaDao {
    List<Pengguna> getUsernameAndPassword(String username, String password);
}
