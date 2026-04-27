package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;
import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Implementación del servicio de categorías.
 * Delega las operaciones al repositorio correspondiente.
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    /** Repositorio que gestiona el acceso a los datos de categorías. */
    private final CategoriaRepository categoriaRepository;

    /**
     * Constructor con inyección de dependencias del repositorio.
     */
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Collection<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
