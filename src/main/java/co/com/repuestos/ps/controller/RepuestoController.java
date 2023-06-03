package co.com.repuestos.ps.controller;

import co.com.repuestos.ps.modelo.Repuesto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repuesto")
public class RepuestoController {

    @GetMapping("/v1/{id}")
    public Repuesto getRepuesto(@PathVariable("id") long id){
        Repuesto resultado = new Repuesto();
        resultado.setId(id);
        return resultado;
    }

    @PostMapping("/v1")
    public Repuesto saveRepuesto(@RequestBody Repuesto repuesto){
        Repuesto resultado = new Repuesto();
        resultado.setId(repuesto.getId());
        return resultado;
    }
    @PutMapping
    public String updateRepuesto(@RequestBody Repuesto repuesto){
        return null;
    }
    @DeleteMapping
    public String deleteRepuesto(@PathVariable long id){
        return null;
    }



}
