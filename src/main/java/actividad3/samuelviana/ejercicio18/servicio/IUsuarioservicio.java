package actividad3.samuelviana.ejercicio18.servicio;

import actividad3.samuelviana.ejercicio18.modelo.Usuario;
import java.util.List;

/**
 *
 * @author HP
 */
import java.util.List;

public interface IUsuarioservicio {
    List<Usuario> listarUsuarios();
    void guardar(Usuario user);
    void eliminar(Usuario user);
    Usuario buscar(Usuario user); 
}