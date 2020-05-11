package pe.upc.relaciones.serviciosRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.relaciones.entidades.Motor;
import pe.upc.relaciones.servicios.ServicioMotor;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioMotorRest {
    @Autowired
    private ServicioMotor servicioMotor;

    @GetMapping("/listar")
    public List<Motor> listar(){
        return servicioMotor.listar();
    }

    @PostMapping("/registrar")
    public Motor registrar(@RequestBody Motor motor){
        return servicioMotor.registrar(motor);
    }

    @GetMapping("/rango/{precio1}/{precio2}")
    public List<Motor> rango(@PathVariable(value = "precio1") double p1,@PathVariable(value = "precio2") double p2){
        return servicioMotor.rango(p1,p2);
    }


}
