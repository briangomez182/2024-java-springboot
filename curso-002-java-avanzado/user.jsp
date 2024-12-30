<%@ page import="java.util.List, org.example.entitites.Usuario" %> <%-- Importar las clases --%>

<html>
<head>
    <title>Ejemplo</title>
    <link rel="stylesheet" href="public/css/style.css">
</head>
<body>
    <h1>Lista de Usuariosaa (con bucle for)</h1>

    <%    List<Usuario> usuarios = (List<Usuario>) request.getAttribute("nombreUsuario");
           for (int i = 0; i < usuarios.size(); i++) {
     %>
           <p>Nombre: <%= usuarios.get(i).getNombre() %>, Edad: <%= usuarios.get(i).getEdad() %></p>
     <%  } %>

</body>
</html>