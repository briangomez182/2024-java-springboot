import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de turnos
        List<Turnos> turnos = new ArrayList<>();
        turnos.add(new Turnos(1, "Juan Pérez", "Urgente", LocalDateTime.of(2025, 1, 1, 10, 0), LocalDateTime.of(2025, 1, 1, 11, 0)));
        turnos.add(new Turnos(2, "Ana López", "Consulta", LocalDateTime.of(2025, 1, 2, 12, 0), LocalDateTime.of(2025, 1, 2, 13, 0)));
        turnos.add(new Turnos(3, "Carlos Gómez", "Chequeo", LocalDateTime.of(2025, 1, 3, 9, 0), LocalDateTime.of(2025, 1, 3, 10, 0)));

        // Filtrar por nombrePaciente
        Optional<List<Turnos>> filtroPorNombre = Turnos.filtrarPorNombrePaciente(turnos, "Juan Pérez");
        filtroPorNombre.ifPresent(System.out::println);

        // Filtrar por tipoPaciente
        Optional<List<Turnos>> filtroPorTipo = Turnos.filtrarPorTipoPaciente(turnos, "Consulta");
        filtroPorTipo.ifPresent(System.out::println);

        // Filtrar por rango de fechaHoraInicio
        Optional<List<Turnos>> filtroPorFechaInicio = Turnos.filtrarPorRangoFechaInicio(turnos, LocalDateTime.of(2025, 1, 1, 0, 0), LocalDateTime.of(2025, 1, 2, 0, 0));
        filtroPorFechaInicio.ifPresent(System.out::println);

        // Filtrar por rango de fechaHoraFin
        Optional<List<Turnos>> filtroPorFechaFin = Turnos.filtrarPorRangoFechaFin(turnos, LocalDateTime.of(2025, 1, 1, 0, 0), LocalDateTime.of(2025, 1, 2, 12, 0));
        filtroPorFechaFin.ifPresent(System.out::println);
    }

   
}
