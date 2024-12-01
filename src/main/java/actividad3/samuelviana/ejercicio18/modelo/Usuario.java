package actividad3.samuelviana.ejercicio18.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "code", nullable = false, length = 6)
    private String code;
    @NotEmpty
    private String password;
    @NotEmpty
    private String name;
    @NotEmpty
    private String apellidos;
    @NotEmpty
    private String rol;
    @Email
    private String email;
    private String telefono;
    private String estado;
    private String fechaRegistro;

}
