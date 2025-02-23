package com.miniproject.gudangdadakan.Service.Impl;

import com.miniproject.gudangdadakan.Model.Pengguna;
import com.miniproject.gudangdadakan.Service.PenggunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenggunaServiceImpl {
    @Autowired
    private PenggunaService penggunaService;

    public List<Pengguna> getUsernameAndPassword(String username, String password){
        return penggunaService.findByUsernameAndPassword(username, password);
    }
}
