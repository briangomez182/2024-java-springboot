<%-- Configurar metadatos --%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- Importar las clases --%>
<%@ page import="java.util.List, com.example.entities.Persona" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <%@ include file="partials/header.jsp" %>

    <%-- <a href="/app/personaForm">Agregar Persona</a> --%>


    <h1>Persona listado</h1> 

    <p>Mensaje: <%= request.getAttribute("nombre") %></p>

    <ul>
         <%  List<Persona> listado = (List<Persona>) request.getAttribute("listado");

            for( Persona persona: listado ) { %>

            <li>Cliente: <%= persona.getNombre() %> -
                Apellido: <%= persona.getApellido()%> -
                <%-- Tarjeta :  <%= persona.getTarjetas().stream().findFirst().get().getTipo() %> --%>
            </li>
        <% } %>
    </ul>



</body>
</html>