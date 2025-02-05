package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PilotoDTO;
import com.hackaboss.app.entitites.Equipo;
import com.hackaboss.app.entitites.Piloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PilotoService implements PilotoServiceInterfaz{

    private List<Piloto> pilotos;

    public PilotoService() {
        List<Equipo> equiposDelPilotoA = List.of(new Equipo(1L, "Ferrari", "Italia"), new Equipo(2L, "Alpine", "USA"));
        List<Equipo> equiposDelPilotoB = List.of(new Equipo(2L, "Alpine", "USA"), new Equipo(3L, "McLaren", "Aleman"));

        this.pilotos = new ArrayList<>();
        this.pilotos.add(new Piloto(1L,"Brian","Gomez", 33, "Venezolano", equiposDelPilotoA));
        this.pilotos.add(new Piloto(2L,"Borja","Lopez", 53, "Español", equiposDelPilotoB));

    }
    @Override
    public List<PilotoDTO> buscarPilotos() {
        return this.pilotos.stream().map(piloto -> new PilotoDTO( piloto.getNombre() , piloto.getApellido(), piloto.getNacionalidad())).toList();
    }

    @Override
    public List<PilotoDTO> buscarPilotosPorEquipo(String nombreEquipo) {

        List<Piloto> pilotosPorEquipo = pilotos.stream()
                .filter(p -> p.getEquipos().stream().anyMatch(e -> e.getNombre().equalsIgnoreCase(nombreEquipo))).toList();

        List<PilotoDTO> pilotosDTOPorEquipo = pilotosPorEquipo.stream().map(p -> new PilotoDTO(p.getNombre(), p.getApellido(), nombreEquipo)).toList();

        return pilotosDTOPorEquipo;

    }
}
