package com.sena.cafeteriasena;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
class CafeteriaController {

    @GetMapping({"/", "/bievenido"})
    public String mensajeBienvenida() {
        return "Bienvenido a Cafe Andino";
    }

    @GetMapping("/pedido/{producto}")
    public String preparacionProducto(@PathVariable String producto) {
        return "Se esta preparando un " +  producto;
    }
    

    @GetMapping("/cafeteria")
    public Map<String, Object> infoCafeteria(){
        return Map.of(
            "Nombre", "Coma Pan y Cafe",
            "Ciudad", "Bogotá",
            "abierto", true,
            "horario", "De 8:00 AM a 7:00 PM"
        );
    }

    @GetMapping ("/menu")
    public List<Map<String, Object>> obtenerProductos(){

        return List.of(
            Map.of("Nombre","Cafe Americano","precio", 5000, "disponible", true),
            Map.of("Nombre","Empanada de pollo","precio",3500,"disponible", true),
            Map.of("Nombre", "Jugo de Naranja","precio", 4000, "disponible", false),
            Map.of("Nombre","Pan de bono", "precio", 4500)
        );
    }

    
    @GetMapping("total/{precio}/{cantidad}")
    public String calcularTotal(@PathVariable double precio, @PathVariable double cantidad){
        double total = precio * cantidad;
        
        return "El total del producto es " + total;
    }
    

}