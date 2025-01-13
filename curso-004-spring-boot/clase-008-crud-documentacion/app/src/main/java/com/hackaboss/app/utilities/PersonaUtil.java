package com.hackaboss.app.utilities;

import com.hackaboss.app.dtos.PersonaDTO;
import com.hackaboss.app.models.Persona;

public class PersonaUtil {


    // Convertir entidad Persona a PersonaDTO
    public static PersonaDTO convertirPersonaAPersonaDTO(Persona persona) {
        return new PersonaDTO(persona.getId(), persona.getNombre(), persona.getApellido(), persona.getEdad());
    }

    // Convertir entidad Persona a PersonaDTO
    public static Persona convertirPersonaDTOAPersona(PersonaDTO personaDTO) {
        return new Persona(personaDTO.getId(), personaDTO.getNombre(), personaDTO.getApellido(), personaDTO.getEdad());
    }
}
