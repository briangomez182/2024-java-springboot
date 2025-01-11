package com.ejemplomulticapa.services;

import com.ejemplomulticapa.models.Alumno;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService{

    @Override
    public void crearAlumno(Alumno alu) {
        //lógica de creación
        System.out.println("Persona Creada");
    }

    @Override
    public List<Alumno> obtenerTodosLosAlumnos() {
        //acá debería ir la lógica de devolver la lista de alumnos
        String validacion = "Mostrar el Listado de Alumnos";
        if (validacion != null) {
            List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(new Alumno(1L, "Brian", "Gomez"));
            alumnos.add(new Alumno(2L, "Carlos", "Gomez"));
            // TODO: 09/01/2025 Como puedo crear un objeto si no tengo contructores declarados? Gracias Lombok
            return alumnos;

            // TODO: 09/01/2025 Aqui no va el acceso a los datos como este listado de alumnos, Deberian ir en la capa de respositorio que la veremos en la siguiente clase
        }else{
            throw new UnsupportedOperationException("Erro al buscar todos los alumnos");
        }
    }
    
    //métodos de lógica de negocio
    
    
}
