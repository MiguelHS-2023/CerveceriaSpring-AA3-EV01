package com.cerveceria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación.
 * Al ejecutarla, Spring Boot levanta el servidor web y busca automáticamente
 * las clases de los paquetes modelo, repositorio y controlador.
 *
 * @author EDUARDO RADA
 */
@SpringBootApplication
public class CerveceriaSpringApplication {

    // Punto de entrada del programa
    public static void main(String[] args) {
        SpringApplication.run(CerveceriaSpringApplication.class, args);
    }
}
