package com.hackaboss.app.respositories;

import com.hackaboss.app.entities.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface TurnoRepositorioInterfaz extends JpaRepository<Turno, Long> {

    Optional<Turno> findByCodigoTurno(Long codigoTurno);

}
