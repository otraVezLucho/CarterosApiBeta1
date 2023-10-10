package carteros.api.cartero;

import carteros.api.Usuario;

import carteros.api.ubicacion.Ubicacion;
import carteros.api.vehiculos.Vehiculos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Esta entidad hace la persistencia con la base de datos

@Table( name = "carteros")
@Entity (name = "Cartero")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id") // se usa el parametro id para las comparaciones es como si se re escribiera el metodo
public class Cartero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String contacto;
    private String documento;
    @Embedded
    private Vehiculos vehiculo;
    @Embedded
    private Ubicacion ubicacion;
    @Enumerated(EnumType.STRING)
    private Usuario usuario;

    public Cartero(DatosRergistroCartero datos) {
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.contacto = datos.contacto();
        this.documento = datos.documento();
        this.vehiculo = new Vehiculos(datos.vehiculo());
        this.ubicacion = new Ubicacion(datos.ubicacion());
        this.usuario = datos.usuario();
    }
}
