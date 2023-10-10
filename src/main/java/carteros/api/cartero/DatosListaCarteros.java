package carteros.api.cartero;




//Este DTO se creo para poder devolver la informacion limitada a cierta informacion
public record DatosListaCarteros(String nombre,String email, String contacto, String usuario) {
    public DatosListaCarteros(Cartero cartero){
        this(cartero.getNombre(), cartero.getEmail(), cartero.getContacto(),cartero.getUsuario().toString());
    }

}
