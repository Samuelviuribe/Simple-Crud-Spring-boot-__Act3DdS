package actividad3.samuelviana.ejercicio18.servicio;

import actividad3.samuelviana.ejercicio18.modelo.Estudiantes;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IEstudiantesServicio {
    
    public List<Estudiantes> ListarEstudiantes();
    
    public void guardar(Estudiantes estudiante);
    
    public void eliminar (Estudiantes estudiante);
    
    public Estudiantes buscar(Estudiantes estudiante);
}
