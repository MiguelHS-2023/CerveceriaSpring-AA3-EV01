package com.cerveceria.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa una categoría de cerveza (tabla "categorias").
 * Se usa para llenar el menú desplegable del formulario de productos.
 *
 * @author EDUARDO RADA
 */
@Entity
@Table(name = "categorias")
public class Categoria {

    // Identificador de la categoría
    @Id
    @Column(name = "id_categoria")
    private Integer idCategoria;

    // Nombre que se muestra al usuario
    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    // Descripción de la categoría
    private String descripcion;

    // Constructor vacío requerido por JPA
    public Categoria() {
    }

    // Getters y setters
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
