package com.hackaboss.app.respositories;

import com.hackaboss.app.entities.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemaRepositorioInterfaz extends JpaRepository<Tema, Long> {
}
