package com.example.servlets;

import com.example.controllers.PersonaController;
import com.example.entities.Persona;
import com.example.entities.Tarjeta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/persona")
public class PersonaServlet extends HttpServlet {

    private PersonaController personaController= new PersonaController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //buscar info en la DB
        List<Persona> listado = personaController.findAll();


        //enviarle info a la vista
        request.setAttribute("listado", listado);
        request.setAttribute("nombre", "Brian");
        // Redirigir a la vista JSP
        request.getRequestDispatcher("persona.jsp").forward(request, response);
    }
}
