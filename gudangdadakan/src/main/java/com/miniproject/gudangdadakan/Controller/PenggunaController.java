package com.miniproject.gudangdadakan.Controller;

import com.miniproject.gudangdadakan.Dao.PenggunaDao;
import com.miniproject.gudangdadakan.Model.Pengguna;

import com.miniproject.gudangdadakan.SecurityCheck.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PenggunaController {

    @Autowired
    private PenggunaDao penggunaDao;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){
        String hashedPassword = MD5Util.hash(password);

        List<Pengguna> user = penggunaDao.getUsernameAndPassword(username, hashedPassword);

        if(user.isEmpty()){
            return ResponseEntity.status(401).body("Invalid Username and Password");
        }
        return ResponseEntity.ok().body("Login berhasil!");
    }
}
