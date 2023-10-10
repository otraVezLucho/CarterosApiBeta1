package carteros.api.cartero;

import org.springframework.data.jpa.repository.JpaRepository;
// Este repositorio se utiliza para hacer el CRUD con la base de datos y para eso se debe heredar o extender de la interfaz (JpaRepository)


//Esta interfaz recive el objeto que contiene la informacion y el dato ID que equivale a un tipó Long el cual pertenece al DTO Cartero
public interface CarteroRepository extends JpaRepository <Cartero, Long> {


}
