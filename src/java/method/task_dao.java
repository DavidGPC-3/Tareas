package method;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class task_dao {
    public static List <Tarea> getAllFalse(Connection connection){
        List <Tarea> list = new ArrayList<>();
        try{
            String sql = "SELECT id_tarea, nombre_tarea, tarea_finalizada, fecha_hora FROM tarea WHERE tarea_finalizada= false;";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
                
            while (result.next()) {
                Tarea obj = new Tarea();
                
                obj.setId_tarea(result.getInt("id_tarea"));
                obj.setNombre_tarea(result.getString("nombre_tarea"));
                obj.setTarea_finalizada(result.getBoolean("tarea_finalizada"));
                obj.setFecha(result.getString("fecha_hora"));
                
                list.add(obj);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
    public static List<Tarea> getAllTrue(Connection connection){
        List<Tarea> list = new ArrayList<>();
        try{
            String sql="SELECT id_tarea, nombre_tarea, tarea_finalizada, fecha_hora FROM tarea WHERE tarea_finalizada= true";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            
            while (result.next()) {
                Tarea obj= new Tarea();
                
                obj.setId_tarea(result.getInt("id_tarea"));
                obj.setNombre_tarea(result.getString("nombre_tarea"));
                obj.setTarea_finalizada(result.getBoolean("tarea_finalizada"));
                obj.setFecha(result.getString("fecha_hora"));
                
                list.add(obj);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
    public static int getCount(Connection connection){
        int contador=0;
        try{
            String sql="SELECT count(*) AS contador FROM tarea WHERE tarea_finalizada= false";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            
            if (result.next()) {
                contador=result.getInt("contador");
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return contador;
    }
}
