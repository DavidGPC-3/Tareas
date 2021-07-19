package Controller;

import Modelo.Conectar;
import Modelo.Tarea;
import method.task_dao;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {
    private Conectar connection;
    
    @RequestMapping ("index.htm")
    public ModelAndView index(){
        
        connection = new Conectar();
        connection.createConnection();
        
        List <Tarea> list_false = task_dao.getAllFalse(connection.getConnection());
        int cont= task_dao.getCount(connection.getConnection());
        List <Tarea> list_true= task_dao.getAllTrue(connection.getConnection());
        connection.closeConnection();
        
        ModelAndView mav=new ModelAndView();
        //mav.addObject("Tareas",list_false);
        //mav.addObject("tarea_realizado", list_true);
        //mav.addObject("contador", cont);
        
        mav.setViewName("index");
        return mav;
    }
}
