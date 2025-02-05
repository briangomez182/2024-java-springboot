package com.ejemplomulticapa.services;

import com.ejemplomulticapa.models.Alumno;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService{

    private List<Alumno> alumnos;

    public AlumnoService() {
        this.alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1L, "Brian", "Gomez"));
        alumnos.add(new Alumno(2L, "Carlos", "Gomez"));
        alumnos.add(new Alumno(3L, "Carlos", "Perez"));
    }

    @Override
    public List<Alumno> obtenerTodosLosAlumnos() {
        return this.alumnos;
    }

    @Override
    public void crearAlumno(Alumno alumno) {
        alumno.setId(this.alumnos.size() + 1L);
        this.alumnos.add(alumno);
    }
    //métodos de lógica de negocio
    
    
}
