/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BaseDatos;

import java.security.MessageDigest;

/**
 *
 * @author 7010
 */
public class ClsEncriptar {
     public String Encriptar(String Texto){
        MessageDigest md = null;
         String Regreso="";
        try {
            md= MessageDigest.getInstance("MD5");
            md.update(Texto.getBytes());
            byte[] mb = md.digest();
            Regreso=String.valueOf(Hex.encodeHex(mb));
        } catch (Exception e) {
           e.printStackTrace(System.out);
        }
        return Regreso;
    }
}
