/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.create;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crear {
    public static int save(Connection connection, Tarea obj){
        int result=0;
        
        try{
            String sql="INSERT INTO tarea(nombre_tarea, tarea_finalizada, fecha_hora)"
                    +" VALUES (?,?,Now())";
            System.out.println(sql);
            System.out.println(connection);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, obj.getNombre_tarea());
            preparedStatement.setBoolean(2, obj.isTarea_finalizada());
            
            result = preparedStatement.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            /*
            if (ex.getMessage().contains("llave duplicada")&& ex.getMessage().contains("u_nombre_tarea")) result=-1;
            if (ex.getMessage().contains("llave duplicada")&& ex.getMessage().contains("u_tarea_realizado")) result=-2;
            if (ex.getMessage().contains("llave duplicada")&& ex.getMessage().contains("u_fecha_hora")) result=-3;    
            */
        }
        return result;
    }
}
