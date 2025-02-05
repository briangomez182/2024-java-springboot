package app.controllers;

import app.models.Estudiante;
import app.services.EstudianteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> getEstudiantes() {
        return estudianteService.obtenerEstudiantes();
    }

    @GetMapping("/calificaciones/{numMatricula}")
    public Estudiante getCalificacion(@PathVariable String numMatricula) {
        return estudianteService.obtenerCalificacionPorMatricula(numMatricula);
    }

    @GetMapping("/calificaciones/ordendesc")
    public List<Estudiante> getCalificacionesOrdenadas() {
        return estudianteService.obtenerCalificacionesOrdenadas();
    }
}
