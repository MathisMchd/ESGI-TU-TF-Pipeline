import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @ParameterizedTest
    @CsvSource({
            "2, 5, 7",
            "-1, 1, 0",
            "-6, -2, -8",
            "-100, 15, -85",
            "2.5, 2.5, 5"
    })
    void testAdditionner(double a, double b, double attendu) {
        assertEquals(attendu, Calculatrice.Additionner(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 5, -3",
            "-1, 1, -2",
            "-6, -2, -4",
            "-100, 15, -115"
    })
    void soustraire(double a, double b, double attendu) {
        assertEquals(attendu, Calculatrice.Soustraire(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "9, 3, 3",
            "-6, 2, -3",
            "5, 2, 2.5",
            "0, 5, 0"
    })
    void testDiviser(double a, double b, double attendu) {
        assertEquals(attendu, Calculatrice.Diviser(a, b));
    }

    @Test
    void testDiviserParZeroThrowException() {
        double a = 8;
        double b = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            Calculatrice.Diviser(a,b);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 20",
            "9, 3, 27",
            "-6, 2, -12",
            "5, 0, 0",
            "2, 2.3, 4.6"
    })
    void multiplier(double a, double b, double attendu) {
        assertEquals(attendu, Calculatrice.Multiplier(a, b));
    }
}