package actividad3.samuelviana.ejercicio18;

 
 
import actividad3.samuelviana.ejercicio18.modelo.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author HP
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model modelo){
        
        Usuario u = new Usuario();
        u.setCedula("123");
        u.setPassword("password123");
        u.setNombre("John");
        u.setApellidos("Doe");
        u.setEmail("john.doe@example.com");
        u.setUsername("johndoe");
        u.setRol("admin");
        u.setTelefono("123-456-7890");
        u.setEstado("activo");
        modelo.addAttribute("alguien", u);

        log.info("Ejecutando...");
        return "index";
    }
    
}
