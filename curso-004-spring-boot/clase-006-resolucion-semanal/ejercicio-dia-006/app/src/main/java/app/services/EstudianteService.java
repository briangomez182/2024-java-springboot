package app.services;

import app.models.Calificacion;
import app.models.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class EstudianteService {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public EstudianteService() {
        estudiantes.add(new Estudiante("001", "Juan", "Perez", "2000-05-10", Arrays.asList(new Calificacion(1L, "Java Basico", 8), new Calificacion(2L, "Java Avanzado",9), new Calificacion(3L, "Java Spring Boot",7))));
        estudiantes.add(new Estudiante("002", "Maria", "Gomez", "2001-07-15", Arrays.asList(new Calificacion(1L, "Java Basico",6), new Calificacion(2L, "Java Avanzado",7), new Calificacion(3L, "Java Spring Boot",8))));
        estudiantes.add(new Estudiante("003", "Carlos", "Lopez", "1999-12-20", Arrays.asList(new Calificacion(1L,"Java Basico", 10), new Calificacion(2L,"Java Avanzado", 9), new Calificacion(3L, "Java Spring Boot",9))));
        estudiantes.add(new Estudiante("004", "Ana", "Martinez", "2002-03-25", Arrays.asList(new Calificacion(1L,"Java Basico", 5), new Calificacion(2L, "Java Avanzado",6), new Calificacion(3L, "Java Spring Boot",7))));
        estudiantes.add(new Estudiante("005", "Luis", "Fernandez", "2000-08-30", Arrays.asList(new Calificacion(1L,"Java Basico", 7), new Calificacion(2L, "Java Avanzado",8), new Calificacion(3L, "Java Spring Boot",9))));
    }
    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    public Estudiante obtenerCalificacionPorMatricula(String numMatricula) {
        return estudiantes.stream().filter(e -> e.getNumMatricula().equals(numMatricula)).findFirst().orElse(null);
    }

    public List<Estudiante> obtenerCalificacionesOrdenadas() {
        return estudiantes.stream()
                .sorted(Comparator.comparingDouble(estudiante -> estudiante.getCalificaciones()
                        .stream().mapToDouble(Calificacion::getCalificacion)
                            .average().orElse(0)))
                                .toList();
    }
}
