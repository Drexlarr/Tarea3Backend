package pe.upc.relaciones.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.relaciones.entidades.Motor;
import pe.upc.relaciones.repositorio.RepositorioMotor;

import java.util.List;


@Service
public class ServicioMotor {
    @Autowired
    private RepositorioMotor repositorioMotor;

    public Motor registrar(Motor motor){
        return repositorioMotor.save(motor);
    }

    public List<Motor> listar(){
        return repositorioMotor.findAll();
    }

    public List<Motor> rango(double p1, double p2){
        return repositorioMotor.rangoPrecios(p1,p2);
    }
}
