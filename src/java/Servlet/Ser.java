/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Modelo.Dao;
import Modelo.usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Dao dao = new Dao();
        usuario us = new usuario();
        List<usuario> lista = new ArrayList(); 
        boolean respuesta = true;
        RequestDispatcher rd = null;
        try{
          if(request.getParameter("btnInsert")!= null){
             us.setId(Integer.parseInt(request.getParameter("id")));
             us.setNombre(request.getParameter("nombre"));
             us.setEmail(request.getParameter("email"));
             respuesta = dao.insertar(us);
             request.setAttribute("respuesta", respuesta);
          }else if(request.getParameter("btnUpdate")!= null){
             us.setId(Integer.parseInt(request.getParameter("id")));
             us.setNombre(request.getParameter("nombre"));
             us.setEmail(request.getParameter("email"));
             respuesta = dao.modificar(us);
             request.setAttribute("respuesta", respuesta);   
          }else if(request.getParameter("btnDelete")!= null){
             us.setId(Integer.parseInt(request.getParameter("id")));
             us.setNombre(request.getParameter("nombre"));
             us.setEmail(request.getParameter("email"));
             respuesta = dao.eliminar(us);
             request.setAttribute("respuesta", respuesta);
          }
          rd = request.getRequestDispatcher("index.jsp");
        }catch(NumberFormatException e){
            System.err.println(e.getMessage());
        }
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
