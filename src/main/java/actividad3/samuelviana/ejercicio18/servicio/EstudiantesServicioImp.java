package actividad3.samuelviana.ejercicio18.servicio;

import actividad3.samuelviana.ejercicio18.modelo.Estudiantes;
import actividad3.samuelviana.ejercicio18.dao.IEstudiantesCrud;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class EstudiantesServicioImp implements IEstudiantesServicio {

    @Autowired
    IEstudiantesCrud crudEstudiante;

    @Transactional(readOnly = true)
    @Override
    public List<Estudiantes> ListarEstudiantes() {
        return (List<Estudiantes>) crudEstudiante.findAll();
    }

    @Transactional
    @Override
    public void guardar(Estudiantes estudiante) {
        crudEstudiante.save(estudiante);
    }

    @Transactional
    @Override
    public void eliminar(Estudiantes estudiante) {
        crudEstudiante.delete(estudiante);
    }

    @Transactional(readOnly = true)
    @Override
    public Estudiantes buscar(Estudiantes estudiante) {
        return crudEstudiante.findById(estudiante.getId()).orElse(null);
    }

}
