package com.miniproject.gudangdadakan.Controller;

import com.miniproject.gudangdadakan.Dao.PenggunaDao;
import com.miniproject.gudangdadakan.Model.Pengguna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PenggunaController {

    @Autowired
    private PenggunaDao penggunaDao;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){
        List<Pengguna> user = penggunaDao.getUsernameAndPassword(username, password);

        if(user.isEmpty()){
            return ResponseEntity.status(401).body("Username atau password salah");
        }
        return ResponseEntity.ok().body("Login berhasil!");
    }
}
