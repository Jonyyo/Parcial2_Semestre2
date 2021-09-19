/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 7010
 */
public class ClsConexion {
    private static final String JDBC_URL="jdbc:mysql://localhost:2206/dbcomisiones?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASW="JWick";
    
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASW);

    }
    public static void CloseResul(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void CloseStatement(PreparedStatement statement){
        try {
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void CloseConnection(Connection cn){
        try {
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    
    
    
}
