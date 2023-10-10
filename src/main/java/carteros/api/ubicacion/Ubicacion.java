package carteros.api.ubicacion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Ubicacion {
    private String direccion;
    private String ciudad;
    private String barrio;

    public Ubicacion(DatosUbicacion ubicacion) {
        this.direccion = ubicacion.direccion();
        this.ciudad = ubicacion.ciudad();
        this.barrio = ubicacion.barrio();
    }
}
