package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PilotoDTO;
import com.hackaboss.app.entitites.Equipo;
import com.hackaboss.app.entitites.Piloto;

import java.util.List;

public interface PilotoServiceInterfaz {

    List<PilotoDTO> buscarPilotos();

    List<PilotoDTO> buscarPilotosPorEquipo( String nombreEquipo);
}
