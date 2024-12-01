package actividad3.samuelviana.ejercicio18.dao;

import actividad3.samuelviana.ejercicio18.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */


public interface IUsuarioCrud extends CrudRepository<Usuario, String>{
    
}
