package carteros.api.cartero;

import carteros.api.Usuario;
import carteros.api.ubicacion.DatosUbicacion;
import carteros.api.vehiculos.DatosVehiculos;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

// Este es el DTO para recibir la informacion
//En los DTO se realizan las validaciones para no hacerlas a nivel de servidor se usa la anotacion @NotNull @NotBlank @Email @Pattern(regexp = "\\d{5,6}")
public record DatosRergistroCartero(

        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String contacto,
        @NotBlank
        @Pattern(regexp ="\\d{9,10}")
        String documento,
        @NotNull
        @Valid
        DatosVehiculos vehiculo,
        @NotNull // Uso null porque esta variable recibe un objeto
        @Valid
        DatosUbicacion ubicacion,
        @NotNull // Uno null porque esta variable recibe un ENUM
        Usuario usuario) {

}
