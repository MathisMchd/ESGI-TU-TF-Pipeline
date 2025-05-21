import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    // ADDED
    @Test
    void getName() {
        String expected = "Feuille";
        Product p1 = new Product("Feuille", 15.0);
        assertEquals(expected, p1.getName());
    }

    @Test
    void getPrice() {
        double expected = 15.0;
        Product p1 = new Product("Feuille", 15.0);
        assertEquals(expected, p1.getPrice());
    }

    @Test
    void getNegativPriceShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Feuille", -15.0);
        });
    }
}