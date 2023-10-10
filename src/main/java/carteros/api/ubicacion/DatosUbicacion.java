package carteros.api.ubicacion;

import jakarta.validation.constraints.NotBlank;

//Este es el DTO
public record DatosUbicacion(
        @NotBlank
        String direccion,
        @NotBlank
        String ciudad,
        @NotBlank
        String barrio) {
}
