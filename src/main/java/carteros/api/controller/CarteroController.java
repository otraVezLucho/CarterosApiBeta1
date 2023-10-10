package carteros.api.controller;

import carteros.api.cartero.Cartero;
import carteros.api.cartero.CarteroRepository;
import carteros.api.cartero.DatosRergistroCartero;
import carteros.api.cartero.DatosListaCarteros;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartero")
public class CarteroController {
    @Autowired // Esta ineccion de dependencia No es recomendable por temas de testing usarlo
    private CarteroRepository carteroRepository; // SE INICIALIZA PARA PODER USARLA EN GLOBAL y contiene los metodos de persistencia

    //La anotacion @Valid se encarga de realizar las validaciones justo en este punto antes de enviar informacion a la base de datos
    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRergistroCartero datos){
        System.out.println();
        System.out.println("El request llego, registrado con exito correctamente");
        carteroRepository.save(new Cartero(datos)); //
    }
    /*
    @GetMapping
    public List<DatosListaCarteros> listadoCarteros(){
        return carteroRepository.findAll().stream().map(DatosListaCarteros::new).toList();// usar los datos de listadoCarteros y cree un nuevo cartero con la informacion que trae del la db y que retorne un .toList
    }*/

    @GetMapping // Se hace un get para obtener la informacion como paginas
    public Page<DatosListaCarteros> listadoCarteros(@PageableDefault (size = 3) Pageable paginacion){
        return carteroRepository.findAll(paginacion).map(DatosListaCarteros::new); // No se usa .stream() ni .toList() porque el objeto Pageable devuelve su propio formato
    }


}
