package com.hackaboss.app.respositories;

import com.hackaboss.app.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepositorioInterfaz extends JpaRepository<Curso, Long> {

}
