package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.repositories;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementación del repositorio de categorías usando un HashMap en memoria.
 * Al no usar base de datos, los datos se pierden al reiniciar la aplicación.
 */
@Repository
public class CategoriaRepositoryImpl implements CategoriaRepository {

    /** Mapa que almacena las categorías usando su ID como clave. */
    private final Map<Long, Categoria> categorias = new HashMap<>();

    @Override
    public Collection<Categoria> findAll() {
        return categorias.values();
    }

    @Override
    public Categoria findById(Long id) {
        return categorias.get(id);
    }

    @Override
    public Categoria save(Categoria categoria) {
        categorias.put(categoria.getId(), categoria);
        return categoria;
    }
}
