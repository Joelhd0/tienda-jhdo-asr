package es.iesclaradelrey.da2d1a.tiendajhdoasr.web.controllers;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Controlador que gestiona las peticiones relacionadas con las categorías.
 * Maneja el listado y el detalle de cada categoría.
 */
@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    /** Servicio que proporciona los datos de las categorías. */
    private final CategoriaService categoriaService;

    /**
     * Constructor con inyección del servicio de categorías.
     *
     * @param categoriaService servicio a inyectar
     */
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    /**
     * Muestra la lista de todas las categorías disponibles.
     *
     * @param model modelo para pasar datos a la vista
     * @return nombre de la vista "categorias/list"
     */
    @GetMapping({"", "/"})
    public String listar(Model model) {
        model.addAttribute("categorias", categoriaService.findAll());
        return "categorias/list";
    }

    /**
     * Muestra el detalle de una categoría concreta según su ID.
     *
     * @param id    identificador de la categoría a mostrar
     * @param model modelo para pasar datos a la vista
     * @return nombre de la vista "categorias/detail"
     */
    @GetMapping("/{id}")
    public String detalle(@PathVariable Long id, Model model) {
        model.addAttribute("categoria", categoriaService.findById(id));
        return "categorias/detail";
    }
}
