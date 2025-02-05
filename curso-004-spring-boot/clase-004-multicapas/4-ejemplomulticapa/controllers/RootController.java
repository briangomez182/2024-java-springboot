import app.models.Alumno;
import app.services.AlumnoServiceInterfaz;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class RootContoller {

    AlumnoServiceInterfaz alumnoServiceInterfaz;

    public RootContoller(AlumnoServiceInterfaz alumnoServiceInterfaz) {
        this.alumnoServiceInterfaz = alumnoServiceInterfaz;
    }

    @GetMapping({"/",""})
    public ResponseEntity obtenerTodosLosAlumnos(){
        List<Alumno> listado = alumnoServiceInterfaz.obtenerTodosLosAlumnos();
        return ResponseEntity.status(200).body(listado);
    }

}
