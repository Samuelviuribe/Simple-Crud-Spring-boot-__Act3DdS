package actividad3.samuelviana.ejercicio18.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import actividad3.samuelviana.ejercicio18.modelo.Estudiantes;
import actividad3.samuelviana.ejercicio18.servicio.IEstudiantesServicio;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author HP
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    //IEstudiantesCrud crudEstudiantes;
    IEstudiantesServicio estudianteServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Estudiantes> listaEstudiantes = (List<Estudiantes>) estudianteServicio.ListarEstudiantes();
        modelo.addAttribute("estudiantes", listaEstudiantes);
        log.info("Ejecutando...");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Model model) {
        model.addAttribute("estudiante", new Estudiantes());
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Estudiantes estudiantes) {
        estudianteServicio.guardar(estudiantes);
        return "redirect:/"; 
    }

}
