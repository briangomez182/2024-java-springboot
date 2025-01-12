package com.hackaboss.app.respositories;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepositorioInterfaz extends JpaRepository<Persona, Long> {

}
