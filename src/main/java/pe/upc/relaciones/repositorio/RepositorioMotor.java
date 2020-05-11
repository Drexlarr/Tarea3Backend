package pe.upc.relaciones.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.upc.relaciones.entidades.Motor;

import java.util.List;

public interface RepositorioMotor extends JpaRepository<Motor,Long> {
    @Query("SELECT m FROM Motor m WHERE  m.precio >= :precio1 AND m.precio <= :precio ORDER BY m.precio ASC")
    List<Motor> rangoPrecios( @Param("precio1") double precio1,@Param("precio") double precio);
}
