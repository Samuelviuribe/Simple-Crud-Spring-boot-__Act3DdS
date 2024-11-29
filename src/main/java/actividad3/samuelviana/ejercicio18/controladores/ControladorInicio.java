package actividad3.samuelviana.ejercicio18.controladores;
 
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import actividad3.samuelviana.ejercicio18.dao.IEstudiantesCrud;
import actividad3.samuelviana.ejercicio18.modelo.Estudiantes;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HP
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    IEstudiantesCrud crudEstudiantes;
    @GetMapping("/")
    public String inicio(Model modelo){
        List<Estudiantes> listaEstudiantes = (List<Estudiantes>) crudEstudiantes.findAll();
        modelo.addAttribute("estudiantes", listaEstudiantes); 
        log.info("Ejecutando...");
        return "index";
    }
    
}
