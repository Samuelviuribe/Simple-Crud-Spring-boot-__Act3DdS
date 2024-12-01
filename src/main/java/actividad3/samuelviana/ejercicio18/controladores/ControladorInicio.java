package actividad3.samuelviana.ejercicio18.controladores;

/**
 *
 * @author HP
 */
import actividad3.samuelviana.ejercicio18.modelo.Usuario;
import actividad3.samuelviana.ejercicio18.servicio.IUsuarioservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.Errors;
import javax.validation.Valid;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private IUsuarioservicio userServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Usuario> listaUsuario = userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuario);
        log.info("Ejecutando el Controlador - Lista de Usuarios: {}", listaUsuario);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Usuario usuario) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Usuario usuario, Errors errores) {
        if (errores.hasErrors()) {
            return "modificar";
        }
        userServicio.guardar(usuario);
        return "redirect:/";
    }

    @GetMapping("/editar/{code}")
    public String editar(Usuario usuario, Model modelo) {
        log.info("Invocando el metodo EDITAR");
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario", usuario);
        return "modificar";
    }

    @GetMapping("/eliminar/{code}")
    public String eliminar(Usuario usuario) {
        userServicio.eliminar(usuario);
        return "redirect:/";
    }

}
