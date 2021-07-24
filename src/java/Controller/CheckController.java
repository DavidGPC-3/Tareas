package Controller;

import Modelo.Conectar;
import javax.servlet.http.HttpServletRequest;
import method.CheckedTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class CheckController {
    @RequestMapping(value = "check.htm", method = RequestMethod.GET)
    public ModelAndView checked(HttpServletRequest req){
        
        String tarea_finalizada = req.getParameter("tarea_finalizada");
        int id_tarea=Integer.parseInt(req.getParameter("id_tarea"));
        
        Conectar connection = new Conectar();
        connection.createConnection();
        
        int result= CheckedTask.checked(connection.getConnection(), tarea_finalizada, id_tarea);
        
        connection.closeConnection();
        
        return new ModelAndView("redirect:/index.htm");    
    }
}
