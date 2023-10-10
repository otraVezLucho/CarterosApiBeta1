package carteros.api.vehiculos;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculos {

    private String marca;
    private String modelo;
    private String placa;

    public Vehiculos(DatosVehiculos vehiculo) {
        this.marca = vehiculo.marca();
        this.modelo = vehiculo.modelo();
        this.placa = vehiculo.placa();
    }
}
