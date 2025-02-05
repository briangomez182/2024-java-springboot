package app.services;

import app.models.Estudiante;

import java.util.List;

public interface EstudianteServiceInterfaz {

    List<Estudiante> obtenerEstudiantes();

    Estudiante obtenerCalificacionPorMatricula(String numMatricula);

    List<Estudiante> obtenerCalificacionesOrdenadas();
}
