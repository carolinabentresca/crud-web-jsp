<%-- 
    Document   : index
    Created on : 06/04/2021, 18:46:39
    Author     : EXO
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.usuario"%>
<%@page import="Modelo.Dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD</title>
    </head>
       
    <body style="background: #000000 ;color: #cc00cc;font-family: initial;font-size: 150%">
        <h2 style="background: #ffffff;color: #cc00cc">Formulario del Usuario...</h2>
    <center>
        <form action="ser" method="POST">
            <label>ID</label><br/>
            <input type="text" name="id"  placeholder="id" required="requiered" style="font-size: 100%"/><br/>
            <label>NOMBRE</label><br/>
            <input type="text" name="nombre"  placeholder="nombre" required="requiered" style="font-size: 100%"/><br/>
            <label>EMAIL</label><br/>
            <input type="email" name="email"  placeholder="email" required="requiered" style="font-size: 100%"/><br/>
            <br/>
            <hr/>      
            <input type="submit" value="Insert" name="btnInsert"  style="background: #ffffff;color: #cc00cc;font-size: 100%"/>
            <input type="submit" value="Update"  name="btnUpdate" style="background: #ffffff;color: #00ff00;font-size: 100%"/>
            <input type="submit" value="Delete"  name="btnDelete" style="background: #ffffff;color: #ff0099;font-size: 100%"/>
            <hr/>
        </form>
        <br/>
        <table border="1" style="background: #ffffff;color: #ff0099">
            <tr>
                <td>ID</td>
                <td style="color: #00ff00">NOMBRE</td>
                <td style="color: #cc00cc">EMAIL</td>
            </tr>
            <%
                Dao dao = new Dao();
                usuario us = new usuario();
                List<usuario> lista = dao.listar();
                for (usuario u : lista) {
            %>
            <tr>
                <td> <%= u.getId()%></td>
                <td> <%= u.getNombre()%></td>
                <td> <%= u.getEmail()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </center>
</body>
</html>
