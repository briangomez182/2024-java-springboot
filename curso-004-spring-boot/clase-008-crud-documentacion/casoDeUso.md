Caso de Uso: Gestión de Turnos para Ciudadanos en un Tótem

1. Actores:

Ciudadano
Tótem/Turnero
Profesional
2. Flujo Principal: Solicitar Turno

El ciudadano se acerca al tótem e inicia la solicitud.
El sistema solicita su DNI o ID.
Se muestran los servicios disponibles y el ciudadano elige uno.
El sistema muestra fechas y horarios disponibles.
El ciudadano selecciona un turno.
El sistema genera un ID único para el turno.
Se confirma la reserva y se entrega un comprobante (impreso o digital).
3. Flujos Alternativos:

(A1) El ciudadano no está registrado → Se solicita información adicional.
(A2) No hay turnos disponibles → Se ofrecen fechas alternativas.
(A3) El ciudadano quiere cancelar el turno → Se permite la cancelación antes de la fecha.
4. Reglas de Negocio:

Un ciudadano puede tener varios turnos, pero no más de uno por servicio en el mismo día.
Un turno es único e identificado por un ID.
Se enviará un recordatorio antes del turno.
5. Entidades Principales:

Ciudadano (id, dni, nombre, email, telefono).
Turno (id, fecha, hora, estado, ciudadano_id, profesional_id).
Profesional (id, nombre, especialidad).