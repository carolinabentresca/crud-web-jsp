/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EXO
 */
public class Dao extends Conexion{
    PreparedStatement ps;
    ResultSet rs;
    Connection con = null;
    //insert
    public boolean insertar(usuario us){
        String sql = "insert into usuario(id,nombre,email)values(?,?,?)";
        try{
          con = getConexion();
          ps = con.prepareStatement(sql);
          ps.setInt(1,us.getId());
          ps.setString(2, us.getNombre());
          ps.setString(3, us.getEmail());
          ps.execute();
          con.close();
          return true;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    //modificar
        public boolean modificar(usuario us){
        String sql = "update usuario set nombre = ? , email = ? where id = ?";
        try{
          con = getConexion();
          ps = con.prepareStatement(sql);
          ps.setString(1, us.getNombre());
          ps.setString(2, us.getEmail());
          ps.setInt(3,us.getId());
          ps.executeUpdate();
          con.close();
          return true;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    //eliminar
    public boolean eliminar(usuario us){
        String sql = "delete from usuario where id = ?";
        try{
          con = getConexion();
          ps = con.prepareStatement(sql);
          ps.setInt(1,us.getId());
          ps.execute();
          con.close();
          return true;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    //listar
       public List<usuario> listar(){
        List<usuario> lista = new ArrayList();  
        String sql = "select * from usuario";
        try{
          con = getConexion();
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String email = rs.getString("email");
            usuario us = new usuario(id,nombre,email);
            lista.add(us);
          }
          con.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return lista;
    }
    
}
