package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.models.Persona;
import com.hackaboss.app.respositories.PersonaRepositorioInterfaz;
import com.hackaboss.app.utilities.PersonaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServicio implements PersonaServicioInterfaz {

    @Autowired
    PersonaRepositorioInterfaz repository;

    @Override
    public List<PersonaDTO> buscarTodos() {
        List<Persona> personas = repository.findAll();
        return personas.stream()
                .map(PersonaUtil::convertirPersonaAPersonaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PersonaDTO buscarPorId(Long id) {
        Optional<Persona> persona = repository.findById(id);

        return persona.map(PersonaUtil::convertirPersonaAPersonaDTO)
                .orElse(new PersonaDTO(null,null,null,null));
    }

    @Override
    public PersonaDTO crear(PersonaDTO entidad) {
        //transoformar en un obj persona para ser guardada
        Persona personaRecuperada = PersonaUtil.convertirPersonaDTOAPersona(entidad);
        Persona personaGuardada = repository.save(personaRecuperada);
        return PersonaUtil.convertirPersonaAPersonaDTO(personaGuardada);
    }

    @Override
    public PersonaDTO actualizar(Long id, PersonaDTO entidad) {
        // Verifica si la persona existe
        Optional<Persona> personaOptional = repository.findById(id);
        if (personaOptional.isPresent()) {
            Persona persona = personaOptional.get();

            // Actualiza los campos de la persona con los valores de personaDTO
            persona.setNombre(entidad.getNombre());
            persona.setApellido(entidad.getApellido());
            persona.setEdad(entidad.getEdad());

            // Guarda la entidad actualizada
            Persona personaActualizada = repository.save(persona);

            // Devuelve el DTO actualizado
            return PersonaUtil.convertirPersonaAPersonaDTO(personaActualizada);
        } else {
            throw new RuntimeException("Persona no encontrada con id: " + id);
        }
    }


    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
