package com.cerveceria.controlador;

import com.cerveceria.modelo.Producto;
import com.cerveceria.repositorio.CategoriaRepository;
import com.cerveceria.repositorio.ProductoRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador del módulo de productos.
 * Recibe las peticiones del navegador y decide qué pantalla mostrar.
 * Implementa las cuatro operaciones del CRUD: crear, consultar, actualizar y eliminar.
 *
 * @author EDUARDO RADA
 */
@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository repositorio;
    private final CategoriaRepository categoriaRepositorio;

    // Spring entrega automáticamente los repositorios al crear el controlador
    public ProductoController(ProductoRepository repositorio,
                              CategoriaRepository categoriaRepositorio) {
        this.repositorio = repositorio;
        this.categoriaRepositorio = categoriaRepositorio;
    }

    // CONSULTAR: muestra la lista de todos los productos
    @GetMapping
    public String listar(Model modelo) {
        modelo.addAttribute("productos", repositorio.findAll());
        return "productos/lista";
    }

    // Muestra el formulario vacío para registrar un producto nuevo
    @GetMapping("/nuevo")
    public String nuevo(Model modelo) {
        modelo.addAttribute("producto", new Producto());
        modelo.addAttribute("categorias", categoriaRepositorio.findAll());
        return "productos/formulario";
    }

    // INSERTAR / ACTUALIZAR: si el producto trae ID actualiza, si no, inserta
    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute Producto producto,
                          BindingResult errores, Model modelo) {
        if (errores.hasErrors()) {
            // Hay datos inválidos: vuelve al formulario mostrando los mensajes
            modelo.addAttribute("categorias", categoriaRepositorio.findAll());
            return "productos/formulario";
        }
        repositorio.save(producto);
        return "redirect:/productos";
    }

    // Muestra el formulario con los datos del producto para editarlo
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model modelo) {
        modelo.addAttribute("producto", repositorio.findById(id).orElseThrow());
        modelo.addAttribute("categorias", categoriaRepositorio.findAll());
        return "productos/formulario";
    }

    // ELIMINAR: borra el producto y vuelve a la lista
    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        repositorio.deleteById(id);
        return "redirect:/productos";
    }
}
