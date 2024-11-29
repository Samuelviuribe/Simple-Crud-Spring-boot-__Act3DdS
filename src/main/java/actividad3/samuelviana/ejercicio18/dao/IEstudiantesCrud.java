package actividad3.samuelviana.ejercicio18.dao;

import actividad3.samuelviana.ejercicio18.modelo.Estudiantes;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public interface IEstudiantesCrud extends CrudRepository<Estudiantes, String> {
    
}
