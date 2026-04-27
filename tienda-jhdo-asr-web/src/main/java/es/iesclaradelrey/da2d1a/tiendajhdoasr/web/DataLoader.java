package es.iesclaradelrey.da2d1a.tiendajhdoasr.web;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;
import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services.CategoriaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuración que carga datos iniciales al arrancar la aplicación.
 * Inserta las categorías de ejemplo para que la tienda tenga contenido desde el inicio.
 */
@Configuration
public class DataLoader {

    /**
     * Bean que se ejecuta automáticamente al iniciar la aplicación.
     * Crea y guarda las categorías predefinidas usando el servicio.
     */
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
