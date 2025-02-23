package com.miniproject.gudangdadakan.Service;

import com.miniproject.gudangdadakan.Model.Pengguna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PenggunaService extends JpaRepository <Pengguna, Long> {
    List<Pengguna> findByUsernameAndPassword(String username, String password);
}
