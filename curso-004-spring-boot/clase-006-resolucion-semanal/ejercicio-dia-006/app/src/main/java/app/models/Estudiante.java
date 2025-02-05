package app.models;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    private String numMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private List<Calificacion> calificaciones;
}
