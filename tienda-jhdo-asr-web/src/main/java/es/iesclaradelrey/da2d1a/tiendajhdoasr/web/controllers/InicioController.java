package es.iesclaradelrey.da2d1a.tiendajhdoasr.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador que gestiona la página de inicio de la tienda.
 */
@Controller
public class InicioController {

    /**
     * Muestra la página principal al acceder a la raíz del sitio.
     *
     * @return nombre de la vista "index" a renderizar
     */
    @GetMapping({"", "/"})
    public String inicio() {
        return "index";
    }
}
