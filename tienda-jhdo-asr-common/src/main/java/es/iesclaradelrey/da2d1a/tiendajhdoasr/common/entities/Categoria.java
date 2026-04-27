package es.iesclaradelrey.da2d1a.tiendajhdoasr.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa una categoría de productos en la tienda.
 * Contiene la información básica de cada categoría como nombre, descripción e imagen.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    /** Identificador único de la categoría. */
    private Long id;

    /** Nombre de la categoría, por ejemplo "Zapatillas running". */
    private String nombre;

    /** Descripción breve sobre los productos que incluye la categoría. */
    private String descripcion;

    /** Nombre del archivo de imagen asociado a la categoría. Puede ser null. */
    private String imagen;
}
