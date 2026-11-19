package com.cerveceria;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Prueba básica: verifica que la aplicación arranca correctamente.
 * Requiere MySQL encendido y la contraseña configurada en
 * application-local.properties.
 *
 * @author EDUARDO RADA
 */
@SpringBootTest
class CerveceriaSpringApplicationTests {

    // Si el contexto de Spring carga sin errores, la prueba pasa
    @Test
    void contextLoads() {
    }
}
