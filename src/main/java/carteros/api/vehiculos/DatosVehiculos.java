package carteros.api.vehiculos;

import jakarta.validation.constraints.NotBlank;

//Este es el DTO, este recibe la informacion y la envia a los objetos de persistencia
public record DatosVehiculos(

        @NotBlank
        String marca,
        @NotBlank
        String modelo,
        @NotBlank
        String placa) {

}
