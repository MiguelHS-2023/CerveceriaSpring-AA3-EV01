package com.cerveceria.repositorio;

import com.cerveceria.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de categorías.
 * Se usa para consultar las categorías que existen en la base de datos.
 *
 * @author EDUARDO RADA
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
