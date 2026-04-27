package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;

import java.util.Collection;

/**
 * Interfaz del servicio para la gestión de categorías.
 * Define la lógica de negocio disponible para los controladores.
 */
public interface CategoriaService {

    /**
     * Devuelve todas las categorías disponibles.
     */
    Collection<Categoria> findAll();

    /**
     * Busca una categoría por su ID.
     *
     * @param id identificador de la categoría
     * @return la categoría encontrada, o null si no existe
     */
    Categoria findById(Long id);

    /**
     * Guarda o actualiza una categoría.
     */
    Categoria save(Categoria categoria);
}
