package actividad3.samuelviana.ejercicio18.modelo;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Table(name= "estudiantes")
@Data
public class Estudiantes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String cedula;
    private String password;
    private String nombre;
    private String apellidos;
    private String email;
    private String username;
    private String rol;
    private String telefono;
    private String estado;
    
}
