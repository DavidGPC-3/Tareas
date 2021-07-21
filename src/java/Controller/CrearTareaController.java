package Controller;

import Modelo.Conectar;
import Modelo.Tarea;
import Modelo.create.Crear;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class CrearTareaController {
    @RequestMapping(value = "crear.htm", method = RequestMethod.POST)
    
    public ModelAndView crear(HttpServletRequest request){
        String nombreTarea =request.getParameter("nombre");
        Tarea tarea = new Tarea();
        tarea.setNombre_tarea(nombreTarea);
        tarea.setTarea_finalizada(false);
        
        Conectar connection = new Conectar();
        connection.createConnection();
        
        Crear.save(connection.getConnection(), tarea);
        connection.closeConnection();
        
        
        
        
        return new ModelAndView("redirect:/index.htm");    
    }
}
