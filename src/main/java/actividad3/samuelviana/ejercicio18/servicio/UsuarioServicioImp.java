package actividad3.samuelviana.ejercicio18.servicio;
/**
 *
 * @author HP
 */
import java.util.List;
import actividad3.samuelviana.ejercicio18.dao.IUsuarioCrud;
import actividad3.samuelviana.ejercicio18.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicioImp implements IUsuarioservicio {

    @Autowired
    private IUsuarioCrud crudUser;

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) crudUser.findAll();
    }

    @Override
    public void guardar(Usuario user) {
        crudUser.save(user);
    }

    @Override
    public void eliminar(Usuario user) {
        crudUser.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario buscar(Usuario user) {
        return crudUser.findById(user.getCode()).orElse(null);
    }
}