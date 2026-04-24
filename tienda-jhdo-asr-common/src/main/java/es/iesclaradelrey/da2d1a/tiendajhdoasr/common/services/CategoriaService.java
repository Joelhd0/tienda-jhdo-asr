package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;

import java.util.Collection;

public interface CategoriaService {
    Collection<Categoria> findAll();
    Categoria findById(Long id);
    Categoria save(Categoria categoria);
}