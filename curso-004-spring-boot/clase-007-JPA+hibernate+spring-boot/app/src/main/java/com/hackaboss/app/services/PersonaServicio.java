package com.hackaboss.app.services;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.entities.Persona;
import com.hackaboss.app.respositories.PersonaRepositorioInterfaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio implements PersonaServicioInterfaz {

    @Autowired
    PersonaRepositorioInterfaz repository;

    @Override
    public List<PersonaDTO> buscarTodos() {
        List<Persona> personas = repository.findAll();
        return personas.stream()
                .map(this::convertirPersonaHaciaDTO)
                .toList();
    }

    @Override
    public PersonaDTO buscarPorId(Long id) {
        Optional<Persona> persona = repository.findById(id);

        return persona.map(this::convertirPersonaHaciaDTO)
                .orElse(new PersonaDTO(null,null,null,null));
    }

    @Override
    public PersonaDTO crear(PersonaDTO entidad) {
        //transoformar en un obj persona para ser guardada
        Persona personaRecuperada = this.convertirDTOHaciaPersona(entidad);
        Persona personaGuardada = repository.save(personaRecuperada);
        return this.convertirPersonaHaciaDTO(personaGuardada);
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
            return this.convertirPersonaHaciaDTO(personaActualizada);
        } else {
            throw new RuntimeException("Persona no encontrada con id: " + id);
        }
    }


    @Override
    public  List<PersonaDTO> eliminar(Long id) {
        try {
            repository.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("Persona con el id: " + id  + " no eliminada" );
        }

        return this.buscarTodos();
    }

    @Override
    public PersonaDTO convertirPersonaHaciaDTO(Persona persona) {
        return new PersonaDTO(persona.getId(), persona.getNombre(), persona.getApellido(), persona.getEdad());
    }

    @Override
    public Persona convertirDTOHaciaPersona(PersonaDTO personaDTO) {
        return new Persona(personaDTO.getIdentificador(), personaDTO.getNombre(), personaDTO.getApellido(), personaDTO.getEdad());
    }
}
