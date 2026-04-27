package es.iesclaradelrey.da2d1a.tiendajhdoasr.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuración de la capa web de la aplicación.
 * Registra vistas simples que no necesitan un controlador propio.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Mapea la ruta /terms directamente a la vista "terms" sin pasar por un controlador.
     *
     * @param registry registro de controladores de vista de Spring MVC
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/terms").setViewName("terms");
    }
}
