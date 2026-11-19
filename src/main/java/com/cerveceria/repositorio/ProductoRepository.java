package com.cerveceria.repositorio;

import com.cerveceria.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de productos.
 * Hereda de JpaRepository, que ya trae los métodos para guardar,
 * buscar, listar y eliminar sin escribir SQL (reemplaza al DAO).
 *
 * @author EDUARDO RADA
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
