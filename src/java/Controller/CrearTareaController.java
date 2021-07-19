package Controller;

import Modelo.Conectar;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class CrearTareaController {
    @RequestMapping(value = "crear.htm", method = RequestMethod.POST)
    public ModelAndView crear(HttpServletRequest request){
        Conectar connection = new Conectar();
        connection.createConnection();
        
        return new ModelAndView("redirect:/index.htm");    
    }
}
