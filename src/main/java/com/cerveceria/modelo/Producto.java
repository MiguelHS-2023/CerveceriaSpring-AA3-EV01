package com.cerveceria.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

/**
 * Representa un producto (cerveza) de la tabla "productos".
 * Cada atributo corresponde a una columna de la base de datos.
 *
 * @author EDUARDO RADA
 */
@Entity
@Table(name = "productos")
public class Producto {

    // Identificador único; MySQL lo genera automáticamente (AUTO_INCREMENT)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    // Nombre comercial de la cerveza (obligatorio)
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    // Descripción corta del producto
    private String descripcion;

    // Precio de venta (debe ser mayor que cero)
    @Positive(message = "El precio debe ser mayor que 0")
    private double precio;

    // Porcentaje de alcohol de la cerveza
    @Column(name = "porcentaje_alcohol")
    private double porcentajeAlcohol;

    // Volumen del envase en mililitros
    @Column(name = "volumen_ml")
    private int volumenMl;

    // Unidades disponibles en inventario (no puede ser negativo)
    @PositiveOrZero(message = "El stock no puede ser negativo")
    private int stock;

    // Categoría a la que pertenece (llave foránea hacia "categorias")
    @Column(name = "id_categoria")
    private int idCategoria;

    // Constructor vacío requerido por JPA
    public Producto() {
    }

    // Getters y setters: permiten leer y modificar los atributos privados
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public int getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(int volumenMl) {
        this.volumenMl = volumenMl;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
