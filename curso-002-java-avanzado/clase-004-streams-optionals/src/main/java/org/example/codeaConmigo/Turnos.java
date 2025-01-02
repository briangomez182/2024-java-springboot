

class Turnos {
    private Integer idTurno;
    private String nombrePaciente;
    private String tipoPaciente;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    public Turnos(Integer idTurno, String nombrePaciente, String tipoPaciente, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        this.idTurno = idTurno;
        this.nombrePaciente = nombrePaciente;
        this.tipoPaciente = tipoPaciente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    // Getters y Setters
    public Integer getIdTurno() {
        return idTurno;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    //metodos staticos

    public static Optional<List<Turnos>> filtrarPorNombrePaciente(List<Turnos> turnos, String nombrePaciente) {
        List<Turnos> filtrados = turnos.stream()
                .filter(turno -> turno.getNombrePaciente().equalsIgnoreCase(nombrePaciente))
                .collect(Collectors.toList());
        return filtrados.isEmpty() ? Optional.empty() : Optional.of(filtrados);
    }

    public static Optional<List<Turnos>> filtrarPorTipoPaciente(List<Turnos> turnos, String tipoPaciente) {
        List<Turnos> filtrados = turnos.stream()
                .filter(turno -> turno.getTipoPaciente().equalsIgnoreCase(tipoPaciente))
                .collect(Collectors.toList());
        return filtrados.isEmpty() ? Optional.empty() : Optional.of(filtrados);
    }

    public static Optional<List<Turnos>> filtrarPorRangoFechaInicio(List<Turnos> turnos, LocalDateTime desde, LocalDateTime hasta) {
        List<Turnos> filtrados = turnos.stream()
                .filter(turno -> turno.getFechaHoraInicio().isAfter(desde) && turno.getFechaHoraInicio().isBefore(hasta))
                .collect(Collectors.toList());
        return filtrados.isEmpty() ? Optional.empty() : Optional.of(filtrados);
    }

    public static Optional<List<Turnos>> filtrarPorRangoFechaFin(List<Turnos> turnos, LocalDateTime desde, LocalDateTime hasta) {
        List<Turnos> filtrados = turnos.stream()
                .filter(turno -> turno.getFechaHoraFin().isAfter(desde) && turno.getFechaHoraFin().isBefore(hasta))
                .collect(Collectors.toList());
        return filtrados.isEmpty() ? Optional.empty() : Optional.of(filtrados);
    }

    @Override
    public String toString() {
        return "Turnos{" +
                "idTurno=" + idTurno +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", tipoPaciente='" + tipoPaciente + '\'' +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", fechaHoraFin=" + fechaHoraFin +
                '}';
    }
}