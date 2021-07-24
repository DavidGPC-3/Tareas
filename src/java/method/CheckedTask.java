/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class CheckedTask {
    public static int checked(Connection connection, String tarea_finalizada, int id_tarea){
        int result=0;
        try{
            
            String sql="UPDATE tarea set tarea_realizado= ?::boolean WHERE id_tarea=? ";
            PreparedStatement ps = connection.prepareStatement(sql);
        
            ps.setString(1, tarea_finalizada);
            ps.setInt(2, id_tarea);
        
            result = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
