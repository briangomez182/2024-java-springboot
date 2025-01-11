
package com.ejemplomulticapa.services;

import com.ejemplomulticapa.models.Alumno;
import java.util.List;

public interface IAlumnoService {
    
    //declarando métodos sin implementar
    List<Alumno> obtenerTodosLosAlumnos();
    void crearAlumno (Alumno alu);

    
}
