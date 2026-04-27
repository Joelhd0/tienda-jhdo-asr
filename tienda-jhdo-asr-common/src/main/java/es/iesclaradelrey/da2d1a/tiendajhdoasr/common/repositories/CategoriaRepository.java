package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.repositories;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;

import java.util.Collection;

/**
 * Interfaz del repositorio para acceder a los datos de las categorías.
 * Define las operaciones básicas de consulta y persistencia.
 */
public interface CategoriaRepository {

    /**
     * Devuelve todas las categorías almacenadas.
     */
    Collection<Categoria> findAll();

    /**
     * Busca una categoría por su ID.
     */
    Categoria findById(Long id);

    /**
     * Guarda o actualiza una categoría.
     */
    Categoria save(Categoria categoria);
}
