package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.repositories;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;

import java.util.Collection;

public interface CategoriaRepository {
    Collection<Categoria> findAll();
    Categoria findById(Long id);
    Categoria save(Categoria categoria);
}