package com.hackaboss.app.services;

import com.hackaboss.app.dtos.EquipoDTO;
import com.hackaboss.app.dtos.PilotoDTO;
import com.hackaboss.app.entitites.Equipo;
import com.hackaboss.app.entitites.Piloto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipoService implements EquipoServiceInterfaz {

    private List<Equipo> equipos;

    public EquipoService() {
        this.equipos = new ArrayList<>();
        this.equipos.add(new Equipo(1L, "Ferrari", "Italia"));
        this.equipos.add(new Equipo(2L, "Alpine", "USA"));
        this.equipos.add(new Equipo(3L, "McLaren", "Aleman"));
    }

    @Override
    public List<Equipo> buscarEquiposInscritos() {
        return this.equipos;
    }

    @Override
    public EquipoDTO buscarEquipoPorNombre(String nombre) {
        Equipo equipo = equipos.stream()
                .filter(e -> e.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);

        if (equipo == null) {
            return new EquipoDTO(null, null);
        }else {
            EquipoDTO equipoDTO = new EquipoDTO();
            equipoDTO.setNombreEquipo(equipo.getNombre());
            equipoDTO.setPais(equipo.getPais());
            return equipoDTO;
        }

    }

    @Override
    public EquipoDTO agregarEquipo(Equipo equipo) {
        equipo.setId(this.equipos.size() + 1L);
        this.equipos.add(equipo);
        return new EquipoDTO(equipo.getNombre(), equipo.getPais());
    }
}
