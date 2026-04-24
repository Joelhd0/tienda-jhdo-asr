package es.iesclaradelrey.da2d1a.tiendajhdoasr.web.controllers;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping({"", "/"})
    public String listar(Model model) {
        model.addAttribute("categorias", categoriaService.findAll());
        return "categorias/list";
    }

    @GetMapping("/{id}")
    public String detalle(@PathVariable Long id, Model model) {
        model.addAttribute("categoria", categoriaService.findById(id));
        return "categorias/detail";
    }
}