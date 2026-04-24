package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.services;

import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities.Categoria;
import es.iesclaradelrey.da2d1a.tiendajhdoasr.common.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Implementación del servicio para la gestión de categorías.
 * Proporciona la lógica de negocio necesaria para interactuar con el repositorio de categorías.
 * * @author TuNombre
 * @version 1.0
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    /** Repositorio de persistencia de categorías. */
    private final CategoriaRepository categoriaRepository;

    /**
     * Constructor para la inyección de dependencias del repositorio.
     * * @param categoriaRepository El repositorio que se utilizará para acceder a los datos.
     */
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    /**
     * Recupera todas las categorías existentes en el sistema.
     * * @return Una colección con todas las entidades {@link Categoria}.
     */
    @Override
    public Collection<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    /**
     * Busca una categoría específica por su identificador único.
     * * @param id El identificador de la categoría a buscar.
     * @return La entidad {@link Categoria} encontrada o null si no existe.
     */
    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id);
    }

    /**
     * Guarda una categoría en el sistema, ya sea creando una nueva o
     * actualizando una existente.
     * * @param categoria La entidad {@link Categoria} que se desea persistir.
     * @return La categoría guardada con su estado actualizado (por ejemplo, con ID generado).
     */
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}