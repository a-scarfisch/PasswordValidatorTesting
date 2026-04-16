package security;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    // Los tests deben ir AQUÍ ADENTRO (dentro de estas llaves)

    @Test
    @DisplayName("Debería fallar si la contraseña tiene menos de 8 caracteres")
    void testLongitudCorta() {
        PasswordValidator validator = new PasswordValidator(); // Nombre correcto
        boolean resultado = validator.validar("1234567"); // Método correcto
        assertEquals(false, resultado);
    }

    @Test
    @DisplayName("Debería pasar si tiene exactamente 8 caracteres")
    void testLongitudExacta() {
        PasswordValidator validator = new PasswordValidator();
        boolean resultado = validator.validar("12345678");
        assertEquals(true, resultado);
    }

}
