/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import DataBase.Conexion;
import java.sql.Connection;

/**
 *
 * @author 50378
 */
public interface BaseDatos {
    Conexion conexion = new Conexion();
    Connection cn = conexion.Conexion();
    
    
    
}