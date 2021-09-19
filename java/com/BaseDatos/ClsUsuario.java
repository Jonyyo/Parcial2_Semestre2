/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BaseDatos;

import Com.Form.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 7010
 */
public class ClsUsuario {
    private static final String SQL_INSERT="insert into tb_usuario (user,password) values (?,?);";
    ClsEncriptar ClEncrip=new ClsEncriptar();
    
    public int insert(Usuario usuario){
        String texto="",encriptado ="";
         Connection conexion=null;
        PreparedStatement statement=null;
        int rows=0;
        try{
            conexion=ClsConexion.getConnection();
            statement=conexion.prepareStatement(SQL_INSERT);
            statement.setString(1, usuario.getUsername());
            texto=usuario.getPassword();
            encriptado=ClEncrip.Encriptar(texto);
            statement.setString(2, encriptado);
            rows=statement.executeUpdate();
        }
         catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
           ClsConexion.CloseStatement(statement);
           ClsConexion.CloseConnection(conexion);
        }
        return rows;
    }

    public boolean  Validar(Usuario datos){
         Connection conexion=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        Usuario usuario =new Usuario();
        String texto="",Mostrar ="";
        boolean tienepermiso=false;
       
        
        try {
            conexion=ClsConexion.getConnection();
            texto=datos.getPassword();
            Mostrar=ClEncrip.Encriptar(texto);           
            String Condicion="SELECT * FROM tb_usuario where user='"+datos.getUsername()+"'"
                    + " and password='"+Mostrar+"';";
            statement=conexion.prepareStatement(Condicion);
            rs=statement.executeQuery();
            
            while (rs.next()) {
                    tienepermiso=true;
            }      
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
           ClsConexion.CloseConnection(conexion);
           ClsConexion.CloseResul(rs);
           ClsConexion.CloseStatement(statement);
        }
        
        return tienepermiso;
    }
    
}
