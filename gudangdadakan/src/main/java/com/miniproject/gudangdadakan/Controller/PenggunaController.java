package com.miniproject.gudangdadakan.Controller;

import com.miniproject.gudangdadakan.Model.Pengguna;
import com.miniproject.gudangdadakan.Service.Impl.PenggunaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pengguna")
public class PenggunaController {
    private PenggunaServiceImpl penggunaService;
    private Pengguna user;

    @PostMapping("/login")
    public EntityModel<Pengguna> login(String username, String password){
       Pengguna foundUser = (Pengguna) penggunaService.getUsernameAndPassword(user.getUsername(), user.getPassword());


    }
}
