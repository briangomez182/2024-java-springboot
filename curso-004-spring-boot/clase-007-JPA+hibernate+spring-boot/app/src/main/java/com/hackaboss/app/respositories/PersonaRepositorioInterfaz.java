package com.hackaboss.app.respositories;

import com.hackaboss.app.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositorioInterfaz extends JpaRepository<Persona, Long> {

}
