package es.iesclaradelrey.da2d1a.tiendajhdoasr.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación web de la tienda.
 * Arranca Spring Boot y escanea los paquetes necesarios para cargar los componentes.
 */
@SpringBootApplication(
        scanBasePackages = {
                "es.iesclaradelrey.da2d1a.tiendajhdoasr.common",
                "es.iesclaradelrey.da2d1a.tiendajhdoasr.web"
        }
)
public class WebApp {

    /**
     * Punto de entrada de la aplicación.
     */
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
