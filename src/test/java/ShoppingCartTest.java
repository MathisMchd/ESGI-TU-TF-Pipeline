import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    Product stylo = new Product("Stylo", 1.5);
    Product verre = new Product("Verre", 2.0);

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testEmptyShoppingCart() {
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }


    @Test
    public void testTotalPrice() {
        Product p1 = new Product("Cahier", 3.0);
        Product p2 = new Product("Ruban", 12.0);
        cart.addProduct(p1);
        cart.addProduct(p2);
        assertEquals(15.0, cart.getTotalPrice());
    }


    @Test
    public void testItemCount() {
        Product p1 = new Product("Feuille", 15.0);
        Product p2 = new Product("Clavier", 2.5);
        cart.addProduct(p1);
        cart.addProduct(p2);
        assertEquals(2, cart.getItemCount());
    }


    @Test
    public void testAddNullProductShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> cart.addProduct(null));
    }



    @Test
    public void testClearShoppingCart() {
        cart.addProduct(new Product("Clavier", 25.0));
        cart.clearCart();
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice(), 0.001);
    }


    @Test
    public void testProductWithNegativePriceShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Product("Erreur", -10.0));
    }










    @Test
    public void testRemoveProductSuccessfully() {
        cart.addProduct(stylo);
        cart.addProduct(verre);

        cart.removeProduct(stylo);

        assertEquals(1, cart.getItemCount());
        assertEquals(2.0, cart.getTotalPrice());
    }

    @Test
    public void testRemoveProductThatIsNotInCart() {
        cart.addProduct(verre);
        cart.removeProduct(stylo);

        assertEquals(1, cart.getItemCount());
        assertEquals(2.0, cart.getTotalPrice());
    }

    @Test
    public void testRemoveNullProductThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            cart.removeProduct(null);
        });
    }

    @Test
    public void testRemoveProductFromEmptyCart() {
        Product produitNonPresent = new Product("Clés", 20);
        cart.removeProduct(produitNonPresent);
        assertEquals(0, cart.getItemCount());
    }
}