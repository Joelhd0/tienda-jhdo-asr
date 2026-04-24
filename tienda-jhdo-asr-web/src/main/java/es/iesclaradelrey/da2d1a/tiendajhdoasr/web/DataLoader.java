package es.iesclaradelrey.da2d1a.tiendajhdoasr.web;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;
import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services.CategoriaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initData(CategoriaService categoriaService) {
        return args -> {
            categoriaService.save(new Categoria(
                    1L,
                    "Zapatillas running",
                    "Modelos para correr y entrenar.",
                    "running.jpg"
            ));

            categoriaService.save(new Categoria(
                    2L,
                    "Zapatillas urbanas",
                    "Modelos casual para uso diario.",
                    "urbanas.jpg"
            ));

            categoriaService.save(new Categoria(
                    3L,
                    "Botas deportivas",
                    "Botas para exterior y temporadas frías.",
                    "botas.jpg"
            ));

            categoriaService.save(new Categoria(
                    4L,
                    "Ofertas",
                    "Productos rebajados y promociones especiales.",
                    null
            ));
        };
    }
}