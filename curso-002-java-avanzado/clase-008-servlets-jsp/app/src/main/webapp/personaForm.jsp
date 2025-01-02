<%-- Configurar metadatos --%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario Persona</title>
</head>
<body>
    <%@ include file="partials/header.jsp" %>

     <a href="/app/persona">Listado Personas</a>
    <h1>Formulario para Crear Persona</h1>

    <form action="/app/personaForm" method="POST">
        <!-- Campo para el nombre -->
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        <br><br>

        <!-- Campo para el apellido -->
        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido" required>
        <br><br>

        <!-- Botón para enviar el formulario -->
        <button type="submit">Guardar Persona</button>
    </form>
</body>
</html>
